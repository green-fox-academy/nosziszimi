package com.greenfox.nori.reddit.dataaccesslayer;

import com.greenfox.nori.reddit.model.Post;
import com.greenfox.nori.reddit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 14..
 */
@Component
public class RepoHandler {

  @Autowired
  private PostRepository repo;

  @Autowired
  private UserRepo userRepo;

  public Iterable<Post> findAllPosts() {
    return repo.findAll();
  }

  public void saveUser(User user) {
    userRepo.save(user);
  }

  public void savePost(Post post) {
    repo.save(post);
  }

  public Post findOnePost(long id) {
    return repo.findOne(id);
  }
}
