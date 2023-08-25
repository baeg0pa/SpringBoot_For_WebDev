package com.codepresso.controllerexercise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.codepresso.controllerexercise.service.PostService;

// 설정정보를 넣는 클래스로 인식됨
// Configuration안에 @Bean지정할 수 있음요
@Configuration
public class AppConfig {

    @Bean
    public PostService postService2() {
        return new PostService();
    }
}
