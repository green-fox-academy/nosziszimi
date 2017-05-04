package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by Nóra on 2017. 05. 04..
 */
@Configuration
public class MessageConfiguration {

  @Bean("email")
  @Primary
  public EmailService getEmail() {
    return new EmailService();
  }

  @Bean("tweet")
  public TwitterService getTweet() {
    return new TwitterService();
  }
}
