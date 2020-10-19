package com.example.microservicesdemo.controllers;

import com.example.microservicesdemo.model.DataLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private DataLimit dataLimit;

    @GetMapping("/getLimit")
    public DataLimit retrieveLimits() {
        return new DataLimit(dataLimit.getMinimum(), dataLimit.getMaximum());
    }
}
