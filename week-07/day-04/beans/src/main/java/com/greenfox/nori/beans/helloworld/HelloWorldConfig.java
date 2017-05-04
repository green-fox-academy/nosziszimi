package com.greenfox.nori.beans.helloworld;

import com.greenfox.nori.beans.helloworld.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Nóra on 2017. 05. 04..
 */
@Configuration
public class HelloWorldConfig {
  @Bean
  public HelloWorld getHelloWorld(){
    return new HelloWorld();
  }
}
