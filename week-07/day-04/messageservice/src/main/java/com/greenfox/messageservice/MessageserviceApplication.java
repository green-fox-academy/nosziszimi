package com.greenfox.messageservice;

import com.greenfox.messageservice.configuration.MessageConfiguration;
import com.greenfox.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MessageserviceApplication implements CommandLineRunner {

  //field-based dependency injection
  @Autowired
  MessageProceeder messageProceeder;

  public static void main(String[] args) {
    SpringApplication.run(MessageserviceApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");
    //setter-based DI
    ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfiguration.class);
    messageProceeder.setMs((MessageService) context.getBean("tweet"));
    messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");
  }
}
