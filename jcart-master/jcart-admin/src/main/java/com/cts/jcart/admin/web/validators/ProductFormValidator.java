/**
 * 
 */
package com.cts.jcart.admin.web.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cts.jcart.admin.web.models.ProductForm;
import com.cts.jcart.catalog.CatalogService;
import com.cts.jcart.entities.Product;

/**
 * @author ungtq
 *
 */
@Component
public class ProductFormValidator implements Validator
{
	@Autowired protected MessageSource messageSource;
	@Autowired protected CatalogService catalogService;
	
	@Override
	public boolean supports(Class<?> clazz){
		return Product.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors)
	{
		ProductForm product = (ProductForm) target;
		String sku = product.getSku();
		Product p = catalogService.getProductBySku(sku);
		if(p != null){
			errors.rejectValue("sku", "error.exists", new Object[]{sku}, "Product SKU "+sku+" already exists");
		}
	}
	
}
