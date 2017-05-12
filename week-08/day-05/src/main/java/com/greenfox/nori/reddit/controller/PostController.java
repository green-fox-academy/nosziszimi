package com.greenfox.nori.reddit.controller;

import com.greenfox.nori.reddit.model.Post;
import com.greenfox.nori.reddit.model.PostList;
import com.greenfox.nori.reddit.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nóra on 2017. 05. 12..
 */
@RestController
public class PostController {

  @Autowired
  private PostRepository repo;

  @GetMapping("/posts")
  public PostList list() {
    PostList postList = new PostList();
    repo.save(new Post());
    repo.save(new Post());
    repo.save(new Post());
    postList.setPosts((repo.findAll()));
    return postList;
  }

  @PostMapping("/posts")
  public Post addpost(@RequestBody Post post) {
    repo.save(post);
    return post;
  }

  @PutMapping("/posts/{id}/upvote")
  public Post upvote(@PathVariable("id") long id ) {
    repo.findOne(id).upvote();
    repo.save(repo.findOne(id));
    return repo.findOne(id);
  }

  @PutMapping("/posts/{id}/downvote")
  public Post downvote(@PathVariable("id") long id ) {
    repo.findOne(id).downvote();
    repo.save(repo.findOne(id));
    return repo.findOne(id);
  }

}
