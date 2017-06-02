package com.greenfox.controller;

import com.greenfox.model.Append;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nóra on 2017. 05. 10..
 */
@org.springframework.web.bind.annotation.RestController
public class AppendAController {

  Append append = new Append();

  @GetMapping("/appenda/{appendable}")
  public Append append(@PathVariable ("appendable") String appendable) {
    append.setAppended(appendable + "a");
    return append;
  }
}
