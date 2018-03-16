/**
 * 
 */
package com.cts.jcart.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.jcart.entities.User;

/**
 * @author ungtq
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{

	User findByEmail(String email);
	
	/**
	 * @author UNGTQ
	 * remove user by id
	 * @param id
	 */
	void deleteById(Integer id);
	
	/**
	 * @author ungtq
	 * find by userName
	 * @param userName
	 * @return User
	 */
	User findByUserName(String userName);
}
