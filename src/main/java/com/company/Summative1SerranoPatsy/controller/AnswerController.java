package com.company.Summative1SerranoPatsy.controller;

import com.company.Summative1SerranoPatsy.models.Answer;
import com.company.Summative1SerranoPatsy.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class AnswerController {
    private List<Answer> answerList;
    private int idCounter;

    private AnswerController(){

        answerList = new ArrayList<>();

        answerList.add(new Answer("You will have a good today.",idCounter++));
        answerList.add(new Answer("Go for it! Do it!",idCounter++));
        answerList.add(new Answer("Yes, you will get it.",idCounter++));
        answerList.add(new Answer(" Not likely!",idCounter++));
        answerList.add(new Answer("Tomorrow will be a better day.",idCounter++));
        answerList.add(new Answer("Don't do that.",idCounter++));
        answerList.add(new Answer("Try again later.",idCounter++));

    }


    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answer getRandomAnswer(@RequestBody @Valid Answer question) {
//     Initializing the Answer class
        Answer answer = new Answer();

//     Randomizing the arraylist
        Collections.shuffle(answerList);

//     Getting the question
        question.getAnswer();

//     For loop to get answer with question
        for (Answer answer1 : answerList){
            if (answer.getId() != idCounter){
                answer.setQuestion(question.getQuestion());
                answer= answer1;
            }

        }

        return answer;
    }



}
