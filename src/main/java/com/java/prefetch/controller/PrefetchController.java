package com.java.prefetch.controller;

import com.java.prefetch.Service.PrefetchService;
import com.java.prefetch.dto.PrefetchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(("/api/v1/posts"))
public class PrefetchController {

    @Autowired
    private PrefetchService prefetchService;

    @GetMapping("/")
    private ResponseEntity<?> getAllData(){
        return new ResponseEntity<>(prefetchService.getAllPrefetch(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> getAllData(@PathVariable int id){
        return new ResponseEntity<>(prefetchService.getPrefetchById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    private ResponseEntity<?> addPost(@RequestBody PrefetchDTO prefetchDTO){
        return new ResponseEntity<>(prefetchService.addPost(prefetchDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    private ResponseEntity<?> updatePost(@RequestBody PrefetchDTO prefetchDTO){
        return new ResponseEntity<>(prefetchService.updatePost(prefetchDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> deletePost(@PathVariable int id){
        prefetchService.deletePost(id);
        return new ResponseEntity<>("Post Deleted", HttpStatus.OK);
    }

}
