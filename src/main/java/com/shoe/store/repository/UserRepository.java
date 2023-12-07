package com.shoe.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shoe.store.entity.Shoe;
import com.shoe.store.entity.UserClass;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<UserClass, Integer> {

	@Query(value = "select u from UserClass u where u.username=:username")
	public UserClass getAdmin(@Param("username") String username);

	@Query(value = "select u from UserClass u where u.username=:searchUser")
	public UserClass searchUser(String searchUser);

	@Transactional
	@Modifying
	@Query(value = "update UserClass u set u.password = :newpassword where u.username=:username")
	public void adminChangePassword(@Param("username") String username, @Param("newpassword") String newpassword);

	@Query(value = "select s from Shoe s where s.size=:size")
	public List<Shoe> getShoesBySize(int size);

}
