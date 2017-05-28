/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.MultiThreading;

import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author yokukuma
 */
public class concurrentExample {
       public static void main(String[] args) {
        String s1 = "yogesh";
        String s2 = "yogesh";
        String s3 = new String("yogesh");
        String s4 = new String("yogesh");
        if(s1 == s2){;
            System.err.println("equals");
        }else{
            System.err.println("not equals");
        }
        
        Person p1 = new Person("yogesh", "23");
        Person p2 = new Person("yogesh", "23");
        if(p1.equals(p2)){;
            System.err.println("equals");
        }else{
            System.err.println("not equals");
        }
    }
}


final class Person{
    String name;
    String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        int result = 1;
        result = result* hash + ( (name == null) ? 0: name.hashCode());
        result = result* hash + ( (age == null) ? 0: age.hashCode());
        return result;
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        return true;
    }

    @Override
    protected Object clone() {
        try {
            return (Person)super.clone(); //To change body of generated methods, choose Tools | Templates.
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
}