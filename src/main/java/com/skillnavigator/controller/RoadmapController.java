package com.skillnavigator.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roadmap")
@CrossOrigin("*")
public class RoadmapController {

    @GetMapping
    public List<String> roadmap(){

        return Arrays.asList(

                "Week 1 : Learn DSA",

                "Week 2 : Learn React",

                "Week 3 : Learn Docker",

                "Week 4 : Learn Linux",

                "Week 5 : AWS",

                "Week 6 : Mock Interviews"

        );

    }

}