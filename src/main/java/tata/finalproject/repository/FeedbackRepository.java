package tata.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tata.finalproject.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

}
