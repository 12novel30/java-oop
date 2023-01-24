package com.fastcampus.javaoop.logic;

import java.util.List;

public interface Sort <T extends Comparable<T>>{
    // 인터페이스는 빈 등록 하지 않음
    List<T> sort(List<T> list);
}
