/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
// always prefer premitive data type in place of object
public class test {

    public static void main(String[] args) throws FileNotFoundException {

//        File f = new File("D:\\personal\\work\\learning\\java_basic.txt");

         int oldCapacity = -1234564;
         System.out.println("new number: "+ Integer.toBinaryString(oldCapacity));


//        Scanner sc = new Scanner(f);
//        
//        while(sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }

//        BufferedReader br = new BufferedReader(new FileReader(new File("D:\\personal\\work\\learning\\java_basic.txt")));
//
//        Student s1 = new Student("yogesh", 1, 12);
//        Student s2 = new Student("kumar", 2, 13);
//        Student s3 = new Student("goyal", 3, 14);
//        Student s4 = new Student("goyal", 31, 114);
//        if (s3.compareTo(s4) == 0) {
//            System.out.println("equals");
//        } else {
//            System.out.println("not equal");
//        }
//        
//        Employee e1 = new Employee(1, 20000);
//        Employee e2 = new Employee(2, 10000);
//        
//        List<Employee> l1 = new ArrayList<>();
//        l1.add(e1);
//        l1.add(e2);
//        
//        Collections.sort(l1,Employee.salaryCompare); 
//        
//        for (Employee object : l1) {
//            System.out.println(object.id);
//        }
        
    }
}

class Student implements Comparable<Student> {

    String name;
    int id;
    int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {

        return name.compareTo(o.name);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.id;
        hash = 97 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}

class Employee {

    int salary;
    int id;

    public Employee(int id, int salary) {
        this.salary = salary;
        this.id = id;
    }

    public static Comparator<Employee> salaryCompare = (Employee o1, Employee o2) -> o1.salary - o2.salary;

    public static Comparator<Employee> idCompare = (Employee o1, Employee o2) -> o1.id - o2.id;


}
