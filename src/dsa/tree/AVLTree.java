/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author yokukuma
 */
public class AVLTree {

    Node root;

    public void insert(int data) {
        root = insert(root, data);
    }

    public void printLevel() {
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(true) {
            int nodeCount = q.size();
            // nodeCount (queue size) indicates number of nodes at current level
            if(nodeCount == 0){
                break;
            }
            // Dequeue all nodes of current level and Enqueue all node of next level
            while(nodeCount > 0){
                Node temp = q.remove();
                if(temp.left !=null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                nodeCount--;
                System.out.print(" "+ temp.data);
            }
            // add new line after each level traversal
            System.out.println("");
        }
    }
    
    public void inorder(){
        inorder(root);
    }
    
    private void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(" "+ root.data);
        inorder(root.right);
    }
    
    public int sizeofTree(){
        return sizeofTree(root);
    }
    
    private int sizeofTree (Node root){
        if(root == null){
            return 0;
        }
        return 1+ sizeofTree(root.left)+ sizeofTree(root.right);
    }
    private Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        //after insertion check for all 4 possible voilation and rotate accordingly
        int balance = balance(root.left, root.right);
        if (balance > 1) {

            if (height(root.left.left) >= height(root.left.right)) {
                //Left Left rotate case
                root =  rightRotate(root);
            } else {
                //Left Right rotate case
                root.left = leftRotate(root.left);
                root =  rightRotate(root);
            }
        } else if (balance < -1) {
            if (height(root.right.right) >= height(root.right.left)) {
                //right right rotate case
                root =  leftRotate(root);
            } else {
                //Right Left rotate case
                root.right = rightRotate(root.right);
                root = leftRotate(root);
            }
        }else{
            root.height = setHeight(root);
        }
        return root;
    }

    private int balance(Node left, Node right) {
        return height(left) - height(right);
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    private Node rightRotate(Node root) {
        Node newNode = root.left;
        root.left = newNode.right;
        newNode.right = root;
        root.height = setHeight(root);
        newNode.height = setHeight(root);
        return newNode;
    }

    private Node leftRotate(Node root) {
        Node newNode = root.right;
        root.right = newNode.left;
        newNode.left = root;
        root.height = setHeight(root);
        newNode.height = setHeight(root);
        return newNode;
    }

    private int setHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max((root.left != null ? root.left.height : 0), (root.right != null ? root.right.height : 0));
        }
    }

}

class Node {

    int data;
    Node left;
    Node right;
    int height;

    Node(int data) {
        this.data = data;
        this.height = 0;
        this.left = null;
        this.right = null;
    }
}
