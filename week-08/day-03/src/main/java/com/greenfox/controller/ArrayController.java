package com.greenfox.controller;

import com.greenfox.model.ArrayResult;
import com.greenfox.model.BodyInput;
import com.greenfox.model.Error;
import com.greenfox.model.Result;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nóra on 2017. 05. 10..
 */
@org.springframework.web.bind.annotation.RestController
public class ArrayController {

  Error error = new Error();
  Result result = new Result();
  ArrayResult arrayResult = new ArrayResult();

  @ExceptionHandler(NullPointerException.class)
  public Error exception(NullPointerException e) {
    error.setError("Please provide what to do with the numbers!");
    return error;
  }

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody BodyInput input) {
    Object o = new Object();
    if (input.getWhat().equals("sum")) {
      result.setResult(Result.sum(input.getNumbers()));
      o = result;
    } else if (input.getWhat().equals("multiply")) {
      result.setResult(Result.multiply(input.getNumbers()));
      o = result;
    } else if ((input.getWhat().equals("double"))) {
      arrayResult.setResult(ArrayResult.doubling(input.getNumbers()));
      o = arrayResult;
    }
    return o;
  }

}
