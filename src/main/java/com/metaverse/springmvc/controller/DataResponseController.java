package com.metaverse.springmvc.controller;

import com.metaverse.springmvc.domain.star;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataResponseController {
    @GetMapping("response/json/string")
    public String helloStringjson(){
        return "{\"name\" : \"Meta\", \"age\" : 95}";
    }


    @GetMapping("response/json/instance")
    public star helloInstancejson(){
        return new star("Meta", 88);
    }
}
