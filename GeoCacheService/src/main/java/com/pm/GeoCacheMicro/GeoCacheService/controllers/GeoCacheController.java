package com.pm.GeoCacheMicro.GeoCacheService.controllers;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class GeoCacheController {

    @Autowired
    private Environment env;


    @RequestMapping("/geoCaches")
    public String getImages() {
        return "test";

    }

}
