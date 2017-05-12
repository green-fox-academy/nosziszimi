package com.greenfox.nori.reddit.services;

import com.greenfox.nori.reddit.model.Post;
import java.util.function.LongPredicate;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nóra on 2017. 05. 12..
 */
public interface PostRepository extends CrudRepository<Post, Long> {

}
