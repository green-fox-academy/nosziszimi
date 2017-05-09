package com.greenfox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 09..
 */
@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  int id;
  String title;
  boolean isUrgent = false;
  boolean isDone = false;
}
