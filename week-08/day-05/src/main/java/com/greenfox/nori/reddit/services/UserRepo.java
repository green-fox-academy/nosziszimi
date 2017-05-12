package com.greenfox.nori.reddit.services;

import com.greenfox.nori.reddit.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nóra on 2017. 05. 12..
 */
public interface UserRepo extends CrudRepository<User,Long> {

}
