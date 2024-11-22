package com.anurag.countryquiz.service;

import com.anurag.countryquiz.model.Result;
import com.anurag.countryquiz.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResultService {
    public void saveResult(Result result);
    public List<Result> getAllResults();
}
