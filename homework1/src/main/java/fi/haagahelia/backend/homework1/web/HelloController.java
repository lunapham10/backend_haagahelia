package fi.haagahelia.backend.homework1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



// NEED TO ANNOTATE THE CONTROLLER WITH @CONTROLLER SO THAT IT
// UNDERSTAND TO REPLY WHEN USER GOES WITH BROWSER TO HTTP://LOCALHOST:8080
// EVERY CONTROLLER HAS AT LEAST 3 OPTIONS:
// 1. HARD CODE STRING TO BROWSER 2. CONTENTS OF .HTML FILE 3. JSON
// FOR SIMPLE START WE PICK NUMBER 1 WHICH REQUIRES @RESPONSEBODY ANNOTATION
@Controller
@ResponseBody
public class HelloController {
    // INSIDE CONTROLLER IN MOST CASES NEED METHOD THAT RESPONSES 
    // IN SPECIFIC ENDPOINT THAT IS DONE USING rEQUESTMAPPING

    // @RequestMapping("/hello")
    
    // public String printToScreenHelloWorld (){
    //     return "Hello World!";
    // }

    @RequestMapping("/index")

    public String printToScreenMainPage (){
        return "This is the main page";
    }

    @RequestMapping("/contact")

    public String printToScreenContactPage (){
        return "This is the contact page";
    }

    @RequestMapping("/hello")
    
    public String printToScreenHelloName (@RequestParam(name="location", required = false, defaultValue = "World") String location,
    @RequestParam (name = "name", required = false, defaultValue = "") String name){
        return "Welcome to the " + location + " " + name + "!";
    }

    @GetMapping("/hello")
    public String greetingForm(@RequestParam String param) {
        return new String();
    }
    


}
