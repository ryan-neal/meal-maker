package org.launchcode.mealmaker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MealController {

    @GetMapping("form")
    @ResponseBody
    public String displayForm(){
        return "<html>" + "<body>" +
                "<form method = 'post' action = '/form'>" +
                "<label for ='meat'> Meat: </label>" + "<br>"+
                "<input type='text' name='meat'>" + "<br>" +
                "<label for ='vegetable'> Vegetable: </label>" + "<br>"+
                "<select name ='vegetable'>" +
                "<option value = ''> Please Choose an Option </option>" +
                "<option value = 'Broccoli'> Broccoli </option>" +
                "<option value = 'Cauliflower'> Cauliflower </option>" +
                "<option value = 'Green beans'> Green beans </option>" +
                "<option value = 'Asparagus'> Asparagus </option>" +
                "<option value = 'Salad'> Salad </option>" + "</select>" + "<br>"+
                "<input type = 'submit' value = 'Make meal!' />" +
                "</form>" + "</body>" + "</html>";
        }

    @PostMapping("form")
    @ResponseBody
    public String showFormInput(@RequestParam String meat, @RequestParam String vegetable) {
        if (meat.equals("Lamb")){
            return "I recommend a white whine";
        }
        else if (meat.equals("Steak")) {
            return "I recommend Cabernet Sauvignon";
        }
        else if (vegetable.equals("Salad")){
            return "Rose";
        }
        else {
            return "No whine for you!";
        }
    }
}
