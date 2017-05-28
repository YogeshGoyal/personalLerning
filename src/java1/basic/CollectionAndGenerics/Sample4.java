/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author yokukuma
 */
public class Sample4 {
    public static void main(String[] args) {
        
        List<Student> sList = new ArrayList<>();
        sList.add(new Student(1, 23));
        sList.add(new Student(2, 33));
        sList.add(new Student(3, 34));
        sList.add(new Student(4, 12));
        sList.add(new Student(5, 50));
        
//        Collections.sort(sList, (s1,s2)->{
//            return s1.marks> s2.marks ? 1:-1;
//        });

        Collections.sort(sList);
        sList.forEach(System.out::println);
        
    }
}

// Comparable can be used when we want to add compare capibility in class itself
// Comparator should be used whe we dont want to touch my class and want to implement
// Comparator class seperatly
// So programmer has to decide he can changes Class Implmentation itself then 
// use Comparable else create seperate class for with implemantation of comparator
// Comparable has to create method compareTo wih 1 argument
// Comparator class has to implement compare with 2 argument

class Student implements Comparable<Student>{
    Integer marks;
    Integer rollno;

    public Student(Integer rollno, Integer marks) {
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" + "marks=" + marks + ", rollno=" + rollno + '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.rollno < this.rollno? 1: -1;
    }
    
    
    
    
}