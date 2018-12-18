package com.example.CRUD_demo.repository;

import com.example.CRUD_demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
