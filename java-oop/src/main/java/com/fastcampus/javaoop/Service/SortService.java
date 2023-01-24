package com.fastcampus.javaoop.service;
import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {

    private final Sort<String> sort;

    public SortService(@Qualifier("bubbleSort") Sort<String> sort){
        // bean 이 두개라고 뜨면 @Qualifier
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }
    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
