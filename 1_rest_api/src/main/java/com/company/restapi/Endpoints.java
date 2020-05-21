package com.company.restapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//----------------------------------------------------------------------------------------------------------------------
// @RestController means the class is ready for use by Spring MVC to handle web requests. It combines @Controller and @ResponseBody
// annotations that results in web requests returning data rather than a view.

// @RequestMapping maps path '/' to the home() method and accepts GET http requests as specified by annotation parameters

// @GetMapping is a convenience annotation that uses @RequestMapping(method = {RequestMethod.GET})
// @PostMapping is a convenience annotation that uses @RequestMapping(method = {RequestMethod.POST})

// @Request param takes in a query parameter
// @RequestBody takes in a request body and automatically serialises it to class Person using Jackson



@RestController
public class Endpoints {

    @RequestMapping(method = {RequestMethod.GET}, path = "/")
    public String home() {
        return "you are at home";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @PostMapping("hi")
    public String hi(@RequestBody Person person) {
        return String.format("Hi %s %s", person.getName(), person.getSurname());
    }

}
