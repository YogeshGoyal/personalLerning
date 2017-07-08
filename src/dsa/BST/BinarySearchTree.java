/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.BST;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author yokukuma
 */
public class BinarySearchTree<E> {

    private Node<E> root;

    void delete(E element) {
        delete(element, root);
    }

    private Node<E> delete(E element, Node<E> node) {
        if (node == null) {
            return null;
        } else if (node.getData().hashCode() > element.hashCode()) {
            node.setLeft(delete(element, node.getLeft()));
        } else if (node.getData().hashCode() < element.hashCode()) {
            node.setRight(delete(element, node.getRight()));
        } else {
            if (node.getLeft() == null && node.getRight() == null) {
                node.setData(null);
                node = null;
                return null;
            } else if (node.getLeft() == null && node.getRight() != null) {
                Node<E> temp = node.getRight();
                node.setData(null);
                node = null;
                return temp;
            } else if (node.getLeft() != null && node.getRight() == null) {
                Node<E> temp = node.getLeft();
                node.setData(null);
                node = null;
                return temp;
            } else {
                E temp = getMin(node.getRight());
                node.setData(temp);
                delete(temp, node.getRight());
                return node;
            }
        }
        return node;
    }
    
    
        public int findHeight(){
        return findHeight(root);
    }
    
    private int findHeight(Node<E>  root) {
        if(root == null){
            return -1;
        }
        int lheight = findHeight(root.getLeft());
        int rheight = findHeight(root.getRight());
        return Integer.max(lheight, rheight) +1 ;
    }
    
    public E findMin(){
        if(root == null){
            return null;
        }
        Node<E>  temp = root;
        while(temp.getLeft() != null){
            temp = temp.getLeft();
        }
        return temp.getData();
    }
    
    public E findMax(){
        if(root == null){
            return null;
        }
        Node<E> temp = root;
        while(temp.getRight() != null){
            temp = temp.getRight();
        }
        return temp.getData();
    }
    
    /**
     * this method will be used to check if given tree is BST
     */
    public boolean isBST(){
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    private boolean isBST(Node<E> node,Integer min,Integer max){
        if(node == null){
            return true;
        }
        if(node.getData().hashCode() >= min &&
           node.getData().hashCode() < max  &&
           isBST(node.getLeft(), min, node.getData().hashCode())  &&
                isBST(node.getRight(), node.getData().hashCode(), max)){
            return true;
        }
            
        return false;
    }
    
    public boolean searchNode(E element){
        return searchNode(element,root);
    }
    
    private boolean searchNode(E element, Node<E> node){
        if(node == null){
            return false;
        }
        if(node.getData().hashCode() == element.hashCode()){
            return true;
        }
        if(node.getData().hashCode()> element.hashCode()){
            if(searchNode(element, node.getLeft())){
                return true;
            }
        }else{
            if(searchNode(element, node.getRight())){
                return true;
            }
        }
        return false;
    }
    
    public int countNode(){
        return countNode(root);
    }
    
    private int countNode(Node<E> node){
        if(node == null){
            return 0;
        }
        return 1+ countNode(node.getLeft())+ countNode(node.getRight());
    }
    
    
    public E getMin(Node<E> node) {
        if (node == null) {
            return null;
        }
        Node<E> temp = node;
        while (node.getLeft() != null) {
            temp = temp.getLeft();
        }
        return temp.getData();
    }

    void insert(E element) {
        root = insert(element, root);
    }

    private Node<E> insert(E element, Node<E> base) {
        if (base == null) {
            base = new Node<>(element);
        } else {
            if (base.getData().hashCode() >= element.hashCode()) {
                base.setLeft(insert(element, base.getLeft()));
            } else {
                base.setRight(insert(element, base.getRight()));
            }
        }
        return base;
    }

    void inorder() {
        inorder(root);
    }

    void inorder(Node<E> node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.println(node.getData());
            inorder(node.getRight());
        }
    }

    public void printLevel() {
        System.out.println("hello");
        Queue<Node> pq = new LinkedList<>();
        Node<E> node = root;
        if (node != null) {
            pq.add(node);
        }
        while(Boolean.TRUE) {
            int nodeCount = pq.size();
            if(nodeCount ==0){
                break;
            }
            while (nodeCount>0) {
                Node n = pq.remove();
                System.out.print(n.getData()+" ");
                if (n.getLeft() != null) {
                    pq.add(n.getLeft());
                }
                if (n.getRight() != null) {
                    pq.add(n.getRight());
                }
                nodeCount--;
            }
            System.out.println("");
        }

    }
}

class Node<E> {

    E data;
    private Node<E> left;
    private Node<E> right;

    public Node(E element) {
        left = null;
        right = null;
        data = element;
    }

    public Node() {
        left = null;
        right = null;
        data = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

}