/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author yokukuma
 */
public class StreamExample {
    public static void main(String[] args) throws IOException {
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        
        Stream<Integer> sequentialStream = list.stream();
        Stream<Integer> parallelStream = list.parallelStream();
        
        Stream<Integer> highNumber = parallelStream.filter((t) -> t>90);
        //highNumber.forEach((t) -> System.out.println(t));
        
        Integer sum = highNumber.filter(t-> t>95).mapToInt((value) -> value).sum();
        System.out.println("sum is:" + sum);
        
        Files.list(Paths.get(".")).forEach(System.out::println);
        
    }
}
