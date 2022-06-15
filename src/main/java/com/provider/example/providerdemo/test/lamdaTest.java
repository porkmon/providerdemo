package com.provider.example.providerdemo.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/5/9 16:22
 * @Version 1.0
 */
public class lamdaTest {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Milan",
                "London",
                "New York",
                "San Francisco");
        Stream<String> stream = cities.stream();
        String first = stream.findFirst().get();
        Optional<String> first1 = stream.findFirst();
        System.out.println(first);
    }
}

