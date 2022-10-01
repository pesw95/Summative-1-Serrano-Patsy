package com.company.Summative1SerranoPatsy.controller;

import com.company.Summative1SerranoPatsy.models.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(AnswerController.class)
class AnswerControllerTest {
    // Wiring the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    // A list of records for testing purposes
    private List<Answer> answerList;

    @Before
    public void setUp(){

    }
    // Testing for Post /magic
    @Test
    public void shouldReturnAnswer() throws Exception{
        // ARRANGE
        Answer returnAnswer = new Answer();
        returnAnswer.setQuestion("Does this test work?");
        returnAnswer.setAnswer(returnAnswer.getAnswer());
        returnAnswer.setId(returnAnswer.getId());

        // Convert Java Object to JSON
        String inputJson = mapper.writeValueAsString(returnAnswer);

        Answer outputAnswer = new Answer();
        outputAnswer.setQuestion("Does this test work?");
        outputAnswer.setAnswer(returnAnswer.getAnswer());
        outputAnswer.setId(returnAnswer.getId());

        // Convert Java Object to JSON
        String outputJson = mapper.writeValueAsString(outputAnswer);

        // ACT
        mockMvc.perform(
                        post("/magic")                              // Perform the POST request
                                .content(inputJson)                          // Set the request body
                                .contentType(MediaType.APPLICATION_JSON)    // Tell the server it's in JSON format
                )
                .andDo(print())                                           // Print results to console
                .andExpect(status().isOk());                             // ASSERT (status code is 200)

        }


}

