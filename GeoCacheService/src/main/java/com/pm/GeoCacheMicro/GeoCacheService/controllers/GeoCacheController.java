package com.pm.GeoCacheMicro.GeoCacheService.controllers;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class GeoCacheController {

    @Autowired
    private Environment env;


    @RequestMapping("/geoCaches")
    public String getImages(HttpServletRequest request, HttpServletResponse response) {
        return "test";

    }

}
