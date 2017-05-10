package com.greenfox.controller;

import com.greenfox.model.Doubling;
import com.greenfox.model.Error;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Nóra on 2017. 05. 10..
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

  Doubling d = new Doubling();
  Error e = new Error();

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public Error exception() {
    e.setError("Please provide an input!");
    return e;
  }

  @GetMapping("/doubling")
  public Doubling doubling(@RequestParam("input") int input) {
    d.setReceived(input);
    d.setResult(input*2);
    return d;
  }
}
