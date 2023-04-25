package com.kitchenStory.checks;

import com.kitchenStory.KitchenStoryApplication;
import org.junit.jupiter.api.*;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.web.servlet.function.ServerResponse.ok;
import static org.springframework.web.servlet.function.ServerResponse.status;
@TestMethodOrder(value= MethodOrderer.OrderAnnotation.class)
public class AppCheck extends KitchenStoryApplication {

    /** This class of functions/methods is to test the application for requirements specification or Business Requirements Specification [BRD] **/
    private static WebApplicationContext webApplicationContext;
    private static MockMvc mockMvc;
    @BeforeAll
    public static void setUp(){
        mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @Test
    @Order(1)
    public void getObjects() throws Exception {
        mockMvc.perform(get("/path"))
                .andExpect((ResultMatcher) content().contentType("application/json"))
                .andExpect((ResultMatcher)status(200))
                .andExpect((ResultMatcher) jsonPath("$.key").value("value"))
                .andExpect((ResultMatcher) ok());
    }
}
