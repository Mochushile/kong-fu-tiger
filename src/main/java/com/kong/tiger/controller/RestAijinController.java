package com.kong.tiger.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/10/25.
 */
@RestController
@RequestMapping("/aijin")
public class RestAijinController {

    @Value("${com.kong.tiger.score}")
    private String name;
    @RequestMapping(value = "/name")
    public String getPropertyString(){
        return name;
    }

}
