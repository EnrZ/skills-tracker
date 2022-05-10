package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/form")
    @ResponseBody
    public String form(){
        return "<html>" +
                "<body>" +
                "<p>Name: </p>" +
                "<form method = 'post' action = 'form'>" +
                "<input type = 'text' name ='name'>" +
                "<p>1st fav lang </p>" +
                "<select name = 'firstFav'>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'C'>C</option>" +
                "</select>" +
                "<p>2nd fav lang </p>" +
                "<select name = 'secondFav'>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'c'>C</option>" +
                "</select>" +
                "<p>3rd fav lang </p>" +
                "<select name = 'thirdFav'>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'C'>C</option>" +
                "</select>" +
                "<input type = 'submit'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }

    @PostMapping(value = "/form")
    @ResponseBody
    public String processForm(@RequestParam String name, @RequestParam String firstFav, @RequestParam String secondFav, @RequestParam String thirdFav){
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" +firstFav + "</li>" +
                "<li>" +secondFav + "</li>" +
                "<li>" +thirdFav + "</li>" +
                "</ol>";

        return html;
    }


}
