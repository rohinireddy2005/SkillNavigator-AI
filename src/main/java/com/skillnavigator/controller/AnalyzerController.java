package com.skillnavigator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.skillnavigator.dto.AnalyzerResponse;
import com.skillnavigator.service.AnalyzerService;

@RestController
@RequestMapping("/analyzer")
@CrossOrigin("*")
public class AnalyzerController {

    @Autowired
    private AnalyzerService service;

    @GetMapping
    public AnalyzerResponse analyze(
            @RequestParam Long userId,
            @RequestParam Long companyId){

        return service.analyze(userId, companyId);

    }

}