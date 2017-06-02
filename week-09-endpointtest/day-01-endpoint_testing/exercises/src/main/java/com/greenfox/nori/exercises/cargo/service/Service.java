package com.greenfox.nori.exercises.cargo.service;

import com.greenfox.nori.exercises.cargo.model.Cargo;
import com.greenfox.nori.exercises.cargo.model.Status;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 15..
 */
@Component
public class Service {

  public void increaseCargo(Cargo cargo, String caliber, int amount) {
    if (caliber.equals(".25")) {
      cargo.setCaliber25(cargo.getCaliber25() + amount);
    } else if (caliber.equals(".30")) {
      cargo.setCaliber30(cargo.getCaliber30() + amount);
    } else if (caliber.equals(".50")) {
      cargo.setCaliber50(cargo.getCaliber50() + amount);
    }
  }

  public void updateReady(Cargo cargo) {
    if (cargo.getShipstatus().equals("full")) {
      cargo.setReady(true);
    } else {
      cargo.setReady(false);
    }
  }

  public void updateShipStatus(Cargo cargo) {
    if(cargo.amount() == 0) {
      cargo.setShipstatus("empty");
    } else if (cargo.amount() == 12500) {
      cargo.setShipstatus("full");
    } else if (cargo.amount() > 12500) {
      cargo.setShipstatus("overloaded");
    } else {
      cargo.setShipstatus(calculateShipstatus(cargo));
    }
  }

  private String calculateShipstatus(Cargo cargo) {
    if (cargo.amount() != 0) {
      return Integer.toString((12500*100)/cargo.amount()) + "%";
    } else {
      return "empty";
    }
  }

  public void updateStatus(Status status, Cargo cargo, String caliber, int amount) {
    status.setReceived(caliber);
    status.setAmount(amount);
    status.setShipstatus(cargo.getShipstatus());
    status.setReady(cargo.isReady());
  }
}
