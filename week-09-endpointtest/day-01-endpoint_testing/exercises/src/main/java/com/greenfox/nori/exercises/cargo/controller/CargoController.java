package com.greenfox.nori.exercises.cargo.controller;

import com.greenfox.nori.exercises.cargo.model.Cargo;
import com.greenfox.nori.exercises.cargo.model.Status;
import com.greenfox.nori.exercises.cargo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nóra on 2017. 05. 15..
 */
@RestController
public class CargoController {

  @Autowired
  Cargo cargo;

  @Autowired
  Status status;

  @Autowired
  Service service;

  @GetMapping("/rocket")
  public Cargo rocket() {
    return cargo;
  }

  @GetMapping("/rocket/fill")
  public Status fill(@RequestParam("caliber") String caliber,
          @RequestParam("amount") int amount) {
    service.increaseCargo(cargo, caliber, amount);
    service.updateShipStatus(cargo);
    service.updateReady(cargo);
    service.updateStatus(status, cargo, caliber, amount);
    return status;
  }
}
