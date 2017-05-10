package com.greenfox.controller;

import com.greenfox.model.Error;
import com.greenfox.model.Result;
import com.greenfox.model.Until;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nóra on 2017. 05. 10..
 */
@org.springframework.web.bind.annotation.RestController
public class DoUntilController {

  Result result = new Result();
  Error error = new Error();

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public Error exception() {
    error.setError("Please provide a number!");
    return error;
  }

  @PostMapping("/dountil/{what}")
  public Result doUntil(@RequestBody Until until, @PathVariable("what") String what) {

    if (what.equals("sum")) {
      result.setResult(Result.numberadder(until.getUntil()));
    } else if(what.equals("factor")){
      result.setResult(Result.factor(until.getUntil()));
    }
    return result;
  }
}
