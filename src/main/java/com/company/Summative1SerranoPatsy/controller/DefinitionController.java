package com.company.Summative1SerranoPatsy.controller;

import com.company.Summative1SerranoPatsy.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class DefinitionController {

   private List<Definition> definitionList;
   private int idCounter = 1;


    public DefinitionController(){
        definitionList = new ArrayList<>();

        definitionList.add(new Definition("Dance", " To move your body around usually to the rhythm of sound.", idCounter++));
        definitionList.add(new Definition("Definition", "Statement of meaning of a word.", idCounter++));
        definitionList.add(new Definition("Quiet" , "Making little to no noise.", idCounter++));
        definitionList.add(new Definition("Loud", "Producing loud noise or high tone.", idCounter++));
        definitionList.add(new Definition("Baby", "Very young child, more specifically a new born or months old. ", idCounter++));
        definitionList.add(new Definition("Toddler", "Young child who is starting to walk.", idCounter++));
        definitionList.add(new Definition("Fun", "Action or behaviors that are enjoyable.", idCounter++));
        definitionList.add(new Definition("Dress", "A type of clothing article.", idCounter++));
        definitionList.add(new Definition("Lipstick", "A form of colored cosmetic that is applied on the lips, usually in the for a a stick.", idCounter++));
        definitionList.add(new Definition("Tamale", "A traditional Mexican dish that is made of masa and meat with a spicy sauce. ", idCounter++));

    }

    @RequestMapping(value = "/word" , method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getDefinitionByRandom() {
//     Instantiating the Definition Class
        Definition getDefinition = new Definition();

//   Randomizing the words from list
        Collections.shuffle(definitionList);

//   For loop to return a word with Definition
        for(Definition definition : definitionList) {
            if(definition.getId() != idCounter) {
                getDefinition = definition;
            }

        }
        return getDefinition;
    }

}
