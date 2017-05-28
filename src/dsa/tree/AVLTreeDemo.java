/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.tree;

/**
 *
 * @author yokukuma
 */
public class AVLTreeDemo {

    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        avl.insert(100);
        avl.insert(10);
        avl.insert(10);
        avl.insert(1);
        avl.insert(2);
        avl.insert(3);
        avl.insert(2);
        avl.insert(6);
        avl.insert(5);
        avl.insert(10);
        avl.insert(10);
        avl.insert(10);
        avl.insert(10);
        avl.insert(10);
        avl.insert(-1);
        avl.inorder();
        System.out.println("Size of tree:"+ avl.sizeofTree());
        avl.printLevel();
    }
}
