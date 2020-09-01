package com.example.fundamentalsproject.repo;

import com.example.fundamentalsproject.domain.UserWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<UserWord, Long> {
}
