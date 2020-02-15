package com.cctest.programmedesign.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class testcontroller {

    @ResponseBody
    @RequestMapping("controller")
    public String test(@RequestBody TestParam testParam){
        System.out.println(testParam);
        return "success";
    }
}
