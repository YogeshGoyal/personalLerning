/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsa.inBuildDS;

import java.util.Objects;

/**
 *
 * @author yokukuma
 */
public class CloningSample {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("a", 2);
        s1.getClg().setcName("MNIT");
        s1.getClg().setLocation("Jaipur");
        Student s2 = (Student)s1.clone();
        System.err.println("s1: "+s1);
        System.err.println("s2: "+s2);
    }
}
class Collage implements Cloneable{
    private String cName;
    private String location;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Collage{" + "cName=" + cName + ", location=" + location + '}';
    }
    
    
}
class Student implements Cloneable {

    private String name;
    private int age;
    private Collage clg;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        clg = new Collage();
    }

    public Collage getClg() {
        return clg;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", clg=" + clg + '}';
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.age;
        return hash;
    }
    
//
//    @Override
//    protected Student clone() throws CloneNotSupportedException {
//        return (Student)super.clone(); 
//        
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    
}

