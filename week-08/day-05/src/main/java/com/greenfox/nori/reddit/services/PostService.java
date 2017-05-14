package com.greenfox.nori.reddit.services;

import com.greenfox.nori.reddit.dataaccesslayer.RepoHandler;
import com.greenfox.nori.reddit.model.Post;
import com.greenfox.nori.reddit.model.PostList;
import com.greenfox.nori.reddit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 14..
 */
@Component
public class PostService {

  @Autowired
  RepoHandler handler;

  public PostList list() {
    PostList postList = new PostList();
    postList.setPosts(handler.findAllPosts());
    return postList;
  }

  public Post addpost(Post post, String userName){
    handler.saveUser(new User(userName));
    post.setOwner(userName);
    handler.savePost(post);
    return post;
  }

  public Post upvote(long id, String userName) {
    handler.findOnePost(id).upvote();
    handler.savePost(handler.findOnePost(id));
    return handler.findOnePost(id);
  }

  public Post downvote(long id, String userName) {
    handler.findOnePost(id).downvote();
    handler.savePost(handler.findOnePost(id));
    return handler.findOnePost(id);
  }
}
