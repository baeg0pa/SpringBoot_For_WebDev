package com.codepresso.controllerexercise.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.codepresso.controllerexercise.dto.PostDto;
import com.codepresso.controllerexercise.service.PostService;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public PostDto getPost(@RequestParam Integer id) {
        PostDto result = postService.getPost(id);
        return result;
    }

    @PostMapping
    public String savePost(@RequestBody PostDto postDto) {
        System.out.println(postDto.getId());
        System.out.println(postDto.getTitle());
        System.out.println(postDto.getContent());
        System.out.println(postDto.getUsername());

        return "POST / post";
    }
    
    @PutMapping
    public String updatePost() {
        return "PUT / post";
    }

    @DeleteMapping
    public String deletePost() {
        return "DELETE / post";
    }
}
