package com.telran.prof.springlessons.lessonthirtyone.example.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImplV3 implements ExampleService{

    @Override
    public String getResult() {
        return "World";
    }
}