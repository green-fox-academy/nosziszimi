package com.greenfox;

import com.greenfox.model.Todo;
import com.greenfox.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

  //@Autowired
  //private Repository repo;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    //repo.save(new Todo(0, "valami", true, true));
    //repo.save(new Todo(0, "valami2", true, false));
    //repo.save(new Todo(0, "valami3", false, true));

  }
}

