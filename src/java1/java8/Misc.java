/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.java8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author yokukuma
 */
public class Misc {
    public static void main(String[] args) {
        Student s1 = new Student("saket", "23");
        Student s2 = new Student("sak", "24");
        Student s3 = new Student("yogesh", "25");
        Students<Student> sList = new Students<>();
        sList.addStudent(s1);
        sList.addStudent(s2);
        sList.addStudent(s3);
//        
//        for (Student student : sList) {
//            System.out.println(student);
//        }
        
        //traversing through forEach method of Iterable with anonymous class
        sList.forEach((t) -> {System.out.println(t);});
        
    }
}



class Students<Student> implements Iterable<Student>{
    List<Student> studentList = null;

    public Students() {
         studentList = new LinkedList<Student>();
    }
    
    void addStudent(Student student){
        studentList.add(student);
    }
    
    @Override
    public Iterator iterator() {
        return studentList.iterator();
    }

    
}

class Student{
    String name;
    String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }    

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }
    
    
}