package com.greenfox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 09..
 */

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Todo {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  int id;
  String title;
  boolean isUrgent = false;
  boolean isDone = false;

  public Todo(){

  }

  @Override
  public String toString() {
    return title;
  }

  public Todo(String title) {
    this.title = title;
  }

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public boolean getIsDone() {
    return isDone;
  }
}
