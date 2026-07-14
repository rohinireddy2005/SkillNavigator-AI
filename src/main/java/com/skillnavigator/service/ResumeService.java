package com.skillnavigator.service;

import com.skillnavigator.entity.Resume;
import java.util.List;

public interface ResumeService {
    Resume saveResume(Resume resume);
    List<Resume> getResumesByUserId(Long userId);
}