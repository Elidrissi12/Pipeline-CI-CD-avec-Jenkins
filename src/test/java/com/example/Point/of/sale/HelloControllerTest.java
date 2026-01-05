package com.example.Point.of.sale;

import com.example.Point.of.sale.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void hello_shouldReturnHelloMessage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello from New Test :"));
    }

    @Test
    void user_shouldReturnUsers() throws Exception {
        mockMvc.perform(get("/user"))
                .andExpect(status().isOk())
                .andExpect(content().string("Users"));
    }

    @Test
    void presentation_shouldReturnPresentation() throws Exception {
        mockMvc.perform(get("/presentation"))
                .andExpect(status().isOk())
                .andExpect(content().string("presentation"));
    }
}
