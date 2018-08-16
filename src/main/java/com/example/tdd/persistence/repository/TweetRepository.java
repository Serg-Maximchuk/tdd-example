package com.example.tdd.persistence.repository;

import com.example.tdd.persistence.entity.TweetJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<TweetJPA, Long> {
}
