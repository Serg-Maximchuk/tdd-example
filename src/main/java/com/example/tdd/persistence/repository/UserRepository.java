package com.example.tdd.persistence.repository;

import com.example.tdd.persistence.entity.UserJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserJPA, Long> {
}
