/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 *
 * @author yokukuma
 */
public class ReferenceExample {
    private String status= "hello i am active";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReferenceExample{" + "status=" + status + '}';
    }
    
    public void strongReference(){
        ReferenceExample ex = new ReferenceExample();
        System.out.println(ex);
    }
    
    //If an object has no strong reference but has a soft reference, 
    //then the garbage collector reclaims this object’s memory when GC needs to 
    //free up some memory. To get Object from a soft reference, one can invoke the get() method.
    //If the object is not GCed, it returns the object, otherwise , it returns null.
    public void softReference(){
        SoftReference<ReferenceExample> ex  = new SoftReference<>(getReference());
        System.out.println("Soft reference: "+ ex.get());
    }
 
    //If an object has no strong reference but has a weak reference then GC reclaims
    //this object’s memory in next run even though there is enough memory.
    public void weakReference(){
        int counter =0;
        WeakReference<ReferenceExample> ex = new WeakReference<>(getReference());
        while(ex.get()!=null){
            counter++;
            System.gc();
            System.out.println("Weak reference deleted  after:: " + counter + "  "+ex.get());
        }
    }
    
    public void phantomReference() throws InterruptedException{
        final ReferenceQueue queue = new ReferenceQueue();
        PhantomReference<ReferenceExample> ex = new PhantomReference<>(getReference(),queue);
        System.gc();
        queue.remove();
        System.out.println("Phantom reference: "+ ex.get());
        
        System.out.println("Phantom reference deleted  after");
        
    }
    
    private ReferenceExample getReference(){
        return new ReferenceExample();
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        ReferenceExample ex = new ReferenceExample();
        ex.strongReference();
        ex.softReference();
        ex.weakReference();
        ex.phantomReference();
            
    }
}
