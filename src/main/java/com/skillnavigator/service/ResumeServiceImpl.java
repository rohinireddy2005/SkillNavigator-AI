package com.skillnavigator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skillnavigator.entity.Resume;
import com.skillnavigator.repository.ResumeRepository;
import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeRepository repository;

    @Override
    public Resume saveResume(Resume resume) {
        return repository.save(resume);
    }

    @Override
    public List<Resume> getResumesByUserId(Long userId) {
        return repository.findByUserId(userId);
    }
}