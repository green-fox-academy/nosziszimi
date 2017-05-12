package com.greenfox.nori.reddit.model;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nóra on 2017. 05. 12..
 */
@Getter @Setter
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    String title, href;
    Timestamp timestamp;
    int score;
    String owner;
    int vote;

    public Post() {
    timestamp = new Timestamp(System.currentTimeMillis());
    }

    public Post(String title, String href) {
      this.title = title;
      this.href = href;
      timestamp = new Timestamp(System.currentTimeMillis());
    }
}
