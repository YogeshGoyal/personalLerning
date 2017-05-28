/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.anotation;

/**
 *
 * @author yokukuma
 */

public class BusinessLogic {
    public BusinessLogic() {
        super();
    }
    
    public void compltedMethod() {
        System.out.println("This method is complete");
    }    
    
    @Todo(priority = Todo.Priority.HIGH)
    public void notYetStartedMethod() {
        // No Code Written yet
    }
    
    @Todo(priority = Todo.Priority.MEDIUM, author = "Uday", status = Todo.Status.STARTED)
    public void incompleteMethod1() {
        //Some business logic is written
        //But its not complete yet
    }

    @Todo(author = "yogesh" , status = Todo.Status.STARTED, priority = Todo.Priority.HIGH)
    public void incompleteMethod2() {
        //Some business logic is written
        //But its not complete yet
    }
}

