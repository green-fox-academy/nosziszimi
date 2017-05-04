package com.greenfox.nori.beans.colors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Nóra on 2017. 05. 04..
 */
@Configuration
public class ColorConfig {
  @Bean
  public MyColor getMyColor() {
    return new RedColor();
  }
}
