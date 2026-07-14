package com.skillnavigator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.skillnavigator.entity.Resume;
import com.skillnavigator.service.ResumeService;
import com.skillnavigator.service.S3Service;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/resume")
@CrossOrigin("*")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @Autowired
    private S3Service s3Service;

    @PostMapping("/upload")
    public Resume upload(@RequestParam("file") MultipartFile file,
                         @RequestParam("userId") Long userId) throws IOException {
        String s3Url = s3Service.uploadFile("skillnavigator-resumes-123", file);
        Resume resume = new Resume();
        resume.setUserId(userId);
        resume.setResumeUrl(s3Url);
        return resumeService.saveResume(resume);
    }

    @GetMapping("/user/{userId}")
    public List<Resume> getResumesByUser(@PathVariable Long userId) {
        return resumeService.getResumesByUserId(userId);
    }
}