package com.greenfox.nori.beans.colors;

import com.greenfox.nori.beans.helloworld.HelloWorldApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ColorApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloWorldApplication.class, args);
    ApplicationContext context = new AnnotationConfigApplicationContext(ColorConfig.class);
    RedColor redColor = context.getBean(RedColor.class);
    redColor.printColor();
  }
}
