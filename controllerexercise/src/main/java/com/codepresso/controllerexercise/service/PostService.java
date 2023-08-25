package com.codepresso.controllerexercise.service;

import org.springframework.stereotype.Service;
import com.codepresso.controllerexercise.dto.PostDto;


// Service annotation과 Bean은 같은 이름의 메소드로 동시 사용 불가
@Service
public class PostService {
    public PostDto getPost(Integer id) {
        System.out.println("find post data from database by " + id);
        System.out.println("validate data from database");
        System.out.println("process data if necessary");

        return new PostDto(id, "title", "this is content", "dhlee");
    }
}
