/**
 * 
 */
package com.cts.jcart.security;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.jcart.entities.User;

/**
 * @author ungtq
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{

	User findByEmail(String email);
	
	/**
	 * @author ungtq
	 * @param id
	 * @return User
	 */
	User findById(Integer id);
	
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
	@Query("select u from User u where u.disabled = false and u.userName = :userName")
	User findByUserName(@Param("userName") String userName);
	
	/**
	 * @author ungtq
	 * @param query
	 * @return 
	 */
	@Query("select p from User p where p.shipper=true")
	List<User> getShippers();
	
	/**
	 * get all user with disabled = false
	 * @param pageable
	 * @return
	 */
	@Query("select u from User u where u.disabled = false")
	Page<User> findActiveUsers(Pageable pageable);
	
	/**
	 * get all user with disabled = false
	 * @param pageable
	 * @return
	 */
	@Query("select u from User u where u.disabled = false and u.userName != :userName")
	Page<User> findActiveUsersWithChat(Pageable pageable, @Param("userName") String userName);
}
