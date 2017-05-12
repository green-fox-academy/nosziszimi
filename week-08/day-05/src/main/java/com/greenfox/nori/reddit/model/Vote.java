package com.greenfox.nori.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nóra on 2017. 05. 12..
 */
@Entity
@Getter @Setter
public class Vote {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  int voteId;

  String userId;
  long postId;
}
