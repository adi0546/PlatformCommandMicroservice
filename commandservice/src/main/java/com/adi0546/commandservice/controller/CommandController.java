package com.adi0546.commandservice.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommandController {
    @GetMapping("/ABC")
    public String getABCs(){
        return "aaa";
    }

    @GetMapping("/ABC/{id}")
    public String getABC(@PathVariable("id") Long id){
        return "aaa"+id;
    }

    //using request params
    @DeleteMapping("/ABC")
    public String deleteABC(@RequestParam("id") Long id){
        return "abc delete"+id;
    }
}