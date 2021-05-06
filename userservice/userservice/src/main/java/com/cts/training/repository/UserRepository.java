package com.cts.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.training.bean.User;

import java.util.List;
public interface UserRepository extends JpaRepository<User,Long>{
List<User> findByAddress(String Address);
User findByUsername(String username); 

}
