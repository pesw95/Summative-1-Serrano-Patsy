package com.company.Summative1SerranoPatsy.controller;

import com.company.Summative1SerranoPatsy.models.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)
class QuoteControllerTest {
    // Wiring the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON
    private ObjectMapper mapper = new ObjectMapper();

    //    List for testing purposes
    private List<Quote> quoteList;

    @Before
    public void setUp(){
    }

    // Test for Get /quote
    @Test
    public void shouldReturnRandomQuote() throws Exception {
            // ARRANGE
            // Convert Java object to JSON
            String outputJson = mapper.writeValueAsString(quoteList);

            // ACT
            mockMvc.perform(get("/quote"))                // Perform the GET request
                    .andDo(print())                                // Print results to console
                    .andExpect(status().isOk());                  // ASSERT (status code is 200)
        }

}
