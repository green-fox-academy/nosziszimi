package com.greenfox.nori.reddit.controller;

import com.greenfox.nori.reddit.model.PostList;
import com.greenfox.nori.reddit.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nóra on 2017. 05. 12..
 */
@RestController
public class PostControler {

  @Autowired
  private PostRepository repo;

  @GetMapping("/posts")
  public PostList list() {
    PostList postList = new PostList();
    return postList;
  }
}
