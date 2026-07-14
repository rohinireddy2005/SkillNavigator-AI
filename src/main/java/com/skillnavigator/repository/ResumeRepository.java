package com.skillnavigator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillnavigator.entity.Resume;
import java.util.List;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
    List<Resume> findByUserId(Long userId);
}