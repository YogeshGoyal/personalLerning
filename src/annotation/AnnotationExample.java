/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotation;

import java.io.FileNotFoundException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yokukuma
 */
public class AnnotationExample {

    public static void main(String[] args) {
        try{
            for(Method method : AnnotationExample.class.getClassLoader().loadClass("annotation").getMethods()){
                if(method.isAnnotationPresent(annotation.MethodInfo.class)){
                    for(Annotation anno : method.getDeclaredAnnotations()){
                        System.out.println("Method: "+ method+ " Annotation name: "+ anno);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    @MethodInfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 1)
    public String toString() {
        return "Overriden toString method";
    }

    @Deprecated
    @MethodInfo(comments = "deprecated method", date = "Nov 17 2012")
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }

    @SuppressWarnings({"unchecked", "deprecation"})
    @MethodInfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 10)
    public static void genericsTest() throws Exception {
        List l = new ArrayList();
        l.add("abc");
        oldMethod();
    }

}
