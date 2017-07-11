/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.advance_topic.executorframework;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yokukuma
 */
public class WorkerThread implements Runnable{
    private String command;

    public WorkerThread(String command) {
        this.command = command;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "Start Command: "+ command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+ "End Command: "+ command);
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "WorkerThread{" + "command=" + command + '}';
    }
    
    
}
