/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.tree;

import java.util.List;

/**
 *
 * @author yokukuma
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
//        BinarySearchTree<Integer> bt = new BinarySearchTree<>();
//        bt.insert(123);
//        bt.insert(23);
//        bt.insert(34);
//        bt.insert(234);
//        bt.insert(345);
//        bt.insert(321);
//        bt.insert(2);
//        bt.insert(320);
//        bt.insert(319);
//        
//
//        if(bt.isBST()){
//            System.out.println("tree is BST");
//        }
//        System.out.println("Before InOrder traversal:");
//        bt.inOrder();
//        bt.delete(2);
//        System.out.println("After InOrder traversal:");
//        bt.inOrder();
//        System.out.println("height of tree is: "+bt.findHeight());
//        System.out.println("InOrder traversal:");
////        bt.inOrder();
//
//        System.out.println("Level order traversal: ");
////        bt.processLevelOrderTraversal();
//        System.out.println("PreOrder traversal:");
////       bt.preOrder();
//
//        System.out.println("PostOrder traversal:");
////       bt.postOrder();        
//     


        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(5);
        bt.insert(6);
        bt.insert(2);
        bt.insert(7);
        bt.insert(8);
        
        //List<Integer> ls = bt.rootToLeafSum(8);
        
        bt.postOrder();

    }
}
