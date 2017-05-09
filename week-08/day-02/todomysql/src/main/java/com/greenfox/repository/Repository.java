package com.greenfox.repository;

import com.greenfox.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 09..
 */
public interface Repository extends CrudRepository<Todo, Long> {

}
