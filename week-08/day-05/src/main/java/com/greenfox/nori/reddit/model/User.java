package com.greenfox.nori.reddit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nóra on 2017. 05. 12..
 */
@Entity
@Getter @Setter
@AllArgsConstructor
public class User {
  @Id
  String userName;

  public User() {

  }
}
