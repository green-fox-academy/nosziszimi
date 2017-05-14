package com.greenfox.nori.reddit.controller;

import com.greenfox.nori.reddit.model.Post;
import com.greenfox.nori.reddit.model.PostList;
import com.greenfox.nori.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nóra on 2017. 05. 12..
 */
@RestController
@CrossOrigin("*")
public class PostController {

  @Autowired
  PostService postService;

  @GetMapping("/posts")
  public PostList list() {
    return postService.list();
  }

  @PostMapping("/posts")
  public Post addpost(@RequestBody Post post, @RequestHeader("Username") String userName) {
    return postService.addpost(post, userName);
  }

  @PutMapping("/posts/{id}/upvote")
  public Post upvote(@PathVariable("id") long id, @RequestHeader("Username") String userName) {
    return postService.upvote(id, userName);
  }

  @PutMapping("/posts/{id}/downvote")
  public Post downvote(@PathVariable("id") long id, @RequestHeader("Username") String userName ) {
    return postService.downvote(id, userName);
  }
}
