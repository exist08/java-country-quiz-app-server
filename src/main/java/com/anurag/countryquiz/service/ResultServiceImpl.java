package com.anurag.countryquiz.service;

import com.anurag.countryquiz.model.Result;
import com.anurag.countryquiz.model.Users;
import com.anurag.countryquiz.repository.ResultRepository;
import com.anurag.countryquiz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService{

    @Autowired
    private ResultRepository resultRepository;

    @Override
    public void saveResult(Result result) {
        resultRepository.save(result);
    }

    @Override
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }
}
