package com.metaverse.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {

    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlRedirect(){
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String htmlTemplates(){
        // 내부 로직이 추가될 수 있음
        // prefix classpath: resources까지의 경로 + templates/ 폴더까지
        // suffix .html
        return "hello-template.html";
    }
}
