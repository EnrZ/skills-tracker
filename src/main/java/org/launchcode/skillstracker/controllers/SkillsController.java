package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String base() {
        //responsebody just used as placeholder to say we are overwriting html to return a String
    return "<h1>Skills Tracker</h1>" +
            "<h2>" +
            "</h2>" +
            "<ol>" +
            "<li> JavaScript </li>" +
            "<li> Java </li>" +
            "<li> C </li>" +
            "</ol>"
            ;
    }

    //localhost:8080/form
    @GetMapping("form")
    @ResponseBody
    public String form(){
        return "<html>" +
                "<body>" +
                "<p>Name: </p>" +
                "<form action = 'programming'>" +
                "<input type = 'text' name ='name'>" +
                "<p>1st fav lang </p>" +
                "<select name = '1stfav'>" +
                "<option value = 'js'>Javascript</option>" +
                "<option value = 'j'>Java</option>" +
                "<option value = 'c'>C</option>" +
                "</select>" +
                "<p>2nd fav lang </p>" +
                "<select name = '2ndfav'>" +
                "<option value = 'js'>Javascript</option>" +
                "<option value = 'j'>Java</option>" +
                "<option value = 'c'>C</option>" +
                "</select>" +
                "<p>3rd fav lang </p>" +
                "<select name = '3rdfav'>" +
                "<option value = 'js'>Javascript</option>" +
                "<option value = 'j'>Java</option>" +
                "<option value = 'c'>C</option>" +
                "</select>" +
                "<input type = 'submit'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }


}
