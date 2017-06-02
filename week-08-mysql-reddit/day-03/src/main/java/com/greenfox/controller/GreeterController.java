package com.greenfox.controller;

import com.greenfox.model.Error;
import com.greenfox.model.WelcomeMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nóra on 2017. 05. 10..
 */
@org.springframework.web.bind.annotation.RestController
public class GreeterController {

  Error error = new Error();
  WelcomeMessage welcome = new WelcomeMessage();

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public Error exception(MissingServletRequestParameterException e) {
    error.setError("Please provide a " + e.getParameterName() + "!");
    return error;
  }

  @GetMapping ("/greeter")
  public WelcomeMessage greet(@RequestParam ("name") String name, @RequestParam("title") String title){
    welcome.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
    return welcome;
  }
}
