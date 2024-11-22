package com.anurag.countryquiz.controller;

import com.anurag.countryquiz.model.Result;
import com.anurag.countryquiz.model.Users;
import com.anurag.countryquiz.service.ResultService;
import com.anurag.countryquiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
@CrossOrigin(origins = "http://localhost:5173")
public class ResultController {
    @Autowired
    private ResultService resultService;

    @PostMapping("/add")
    public String addUser(@RequestBody Result result) {
        resultService.saveResult(result);
        return "New Result added";
    }

    @GetMapping("/getall")
    public List<Result> getAllResults() {
        return resultService.getAllResults();
    }
}
