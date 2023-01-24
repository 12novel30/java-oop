package com.fastcampus.javaoop;


import com.fastcampus.javaoop.config.Config;
import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;
import com.fastcampus.javaoop.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);
        System.out.println(
                "[result]"
                        + sortService.doSort(Arrays.asList(args)));
    }
}
