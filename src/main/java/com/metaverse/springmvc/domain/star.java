package com.metaverse.springmvc.domain;

import lombok.Getter;

@Getter
public class star {
    String name;
    int age;

    public star(String name, int age){
        this.name = name;
        this.age = age;
    }
}
