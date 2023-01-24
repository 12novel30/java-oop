package com.fastcampus.javaoop.controller;

import com.fastcampus.javaoop.service.SortService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class MainController {
    private final SortService sortService;

    public MainController(SortService sortService){
        this.sortService = sortService;
    }

    @GetMapping("/")
    public String hello(@RequestParam List<String> list){
        return sortService.doSort(list).toString();
    } // -> localhost:8080/?list=5,3,4
}
