package com.example.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
