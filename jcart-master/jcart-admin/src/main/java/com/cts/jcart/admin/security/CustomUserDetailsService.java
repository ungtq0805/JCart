/**
 * 
 */
package com.cts.jcart.admin.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.jcart.entities.User;
import com.cts.jcart.security.SecurityService;



/**
 * @author ungtq
 *
 */
@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService
{

	@Autowired
	private SecurityService securityService;
	
	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		User user = securityService.findUserByEmail(userName);
		if(user == null){
			throw new UsernameNotFoundException("Email "+userName+" not found");
		}
		return new AuthenticatedUser(user);
	}

}
