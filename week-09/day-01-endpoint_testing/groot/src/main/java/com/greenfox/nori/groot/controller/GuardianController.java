package com.greenfox.nori.groot.controller;

import com.greenfox.nori.groot.model.Error;
import com.greenfox.nori.groot.model.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nóra on 2017. 05. 15..
 */
@RestController
public class GuardianController {

  @ExceptionHandler


  @GetMapping(value="/groot")
  public Object groot(@RequestParam("message") String receivedMessage) {
    if (receivedMessage != null) {
      Message message = new Message(receivedMessage);
      return message;
    } else {
      Error error = new Error();
      return error;
    }
  }
}
