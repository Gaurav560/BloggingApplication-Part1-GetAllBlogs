package com.telusko.controller;

import com.telusko.model.Blog;
import com.telusko.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlogs() {
        List<Blog> blogList = blogService.getAllBlogs();
        System.out.println("this code is in master branch");
        return ResponseEntity.ok(blogList);
    }

}
