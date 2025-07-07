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

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(star);

        System.out.println("json result : " + jsonString);
    }
}
