package com.greenfox;

import com.greenfox.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

  /*@Autowired
  private Repository repo;*/

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
}

