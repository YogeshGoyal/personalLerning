/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.FileHandling;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author yokukuma
 */
public class Sample3 {
    
    public static void main(String[] args) throws IOException {
        
        Path source = Paths.get("D:\\personal\\work\\learning\\chef");
        Path destination = Paths.get("D:\\personal\\work\\learning\\abc2");
        
//        Files.walkFileTree(source, new FileVisitor<Path>() {
//            @Override
//              public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
//                System.out.println("pre visit dir:" + dir);
//                return FileVisitResult.CONTINUE;
//              }
//
//              @Override
//              public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                System.out.println("visit file: " + file);
//                return FileVisitResult.CONTINUE;
//              }
//
//              @Override
//              public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
//                System.out.println("visit file failed: " + file);
//                return FileVisitResult.CONTINUE;
//              }
//
//              @Override
//              public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
//                System.out.println("post visit directory: " + dir);
//                return FileVisitResult.CONTINUE;
//              }
//        } );
        
        
       Files.walk(Paths.get("D:\\personal\\work\\learning\\chef")).filter(Files::isReadable).forEach(System.out::println);
                
    }

}

