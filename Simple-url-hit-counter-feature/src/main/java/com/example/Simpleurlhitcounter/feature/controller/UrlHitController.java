package com.example.Simpleurlhitcounter.feature.controller;

import com.example.Simpleurlhitcounter.feature.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    private UrlHitService urlHitService;

    @GetMapping("count")
    public int getHitCount(){
        return urlHitService.getHitCount();
    }
}
