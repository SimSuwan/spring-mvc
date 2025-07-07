package com.metaverse.springmvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaverse.springmvc.domain.star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class jsontest {

    @Test
    @DisplayName("Object to Json : Get method 필요")
    void test1() throws JsonProcessingException {
        star star = new star("Meta", 55);

        // Jackson 라이브러리의 objectMapper가 파싱 기능을 수행
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(star);

        System.out.println("json result : " + jsonString);
    }

    @Test
    @DisplayName("")
    void test2() throws JsonProcessingException{
        String json = "{\"name\" : \"Suwan\", \"age\" : 23}";

        ObjectMapper objectMapper = new ObjectMapper();
        // json 문자열을 star 클래스에 맞추어 값을 읽고 반환
        star star = objectMapper.readValue(json, star.class);
        System.out.println("name: " + star.getName());
        System.out.println("age: " + star.getAge());
    }
}
