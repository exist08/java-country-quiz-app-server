package com.anurag.countryquiz.repository;

import com.anurag.countryquiz.model.Result;
import com.anurag.countryquiz.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result,Integer> {
//    @Query("SELECT user_id, username FROM users LIMIT 1")
//    Users findLatestUser();
}
