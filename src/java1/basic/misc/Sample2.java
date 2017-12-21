/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.misc;

/**
 *
 * @author yokukuma
 */
public class Sample2 {
    public static void main(String[] args) {
        TrafficSignal ts = TrafficSignal.GREEN;
        System.out.println("green: "+ ts.getAction());
        
        Employee e1 = new Employee("yogesh", 28, 1);
        Employee e2 = new Employee("kumar", 28, 1);
        
        if(e1.equals(e2)){
            System.out.println("objects are equals");
        }
        
        
    }
}

enum TrafficSignal{
    Red("STOP"),
    GREEN("Go"),
    ORANGE("WAIT");
    
    private String action;
    
    private TrafficSignal(String action){
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}

class Employee{
    String name;
    Integer age;
    Integer id;
    
    public Employee(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj == this){
            return true;
        }
        if(! (obj instanceof Employee)){
            return false;
        }
        if( obj == null){
            return false;
        }
        Employee e = (Employee)obj;
        if(this.id != e.id){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
    
}