package com.example.CRUD_demo.repository;

import com.example.CRUD_demo.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>{
	List<Answer> findByQuestionId(Long questionId);
}
