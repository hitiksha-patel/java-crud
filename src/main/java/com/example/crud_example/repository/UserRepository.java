package com.example.crud_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud_example.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
