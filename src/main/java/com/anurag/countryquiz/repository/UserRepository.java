package com.anurag.countryquiz.repository;

import com.anurag.countryquiz.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
//    @Query("SELECT user_id, username FROM users LIMIT 1")
//    Users findLatestUser();
}
