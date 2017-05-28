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
 * @param <ITEM>
 */
public class BinarySearchTree<ITEM> {

    BSTNode<ITEM> root = null;

    public BinarySearchTree() {
    }

    // Function to insert data in tree
    public void insert(ITEM data) {
        root = insert(root, data);
    }

    public void delete(ITEM data){
        delete(root,data);
    }
    
    private BSTNode<ITEM> delete(BSTNode<ITEM> node, ITEM data){
        if(node  == null){
            return null;
        }
        else if(node.getValue().hashCode() > data.hashCode()){
            System.out.println("reached here2");
            node.setLeft(delete(node.getLeft(), data));
        }
        else if(node.getValue().hashCode() < data.hashCode()){
            System.out.println("reached here3");
            node.setRight(delete(node.getRight(), data));
        }else{
            System.out.println("reached here1");
            // I found you , now I will distroy you.
            if(node.getLeft() == null && node.getRight() == null){
                node.setValue(null);
                node = null;
                return null;
            }else if(node.getLeft() != null && node.getRight() == null){
               BSTNode<ITEM> temp = node.getLeft();
               node.setValue(null);
               node = null;
               return temp;
            }else if(node.getLeft() == null && node.getRight() != null){
                BSTNode<ITEM> temp = node.getRight();
                node = null;
                return temp;
            }else if(node.getLeft() != null && node.getRight() != null){
                ITEM temp = getMin(node.getRight());
                node.setValue(temp);
                delete(node.getRight(), temp);
                return node;
            }
        }
        return node;
    }
    
    private ITEM getMin(BSTNode<ITEM> node) {
        if(node == null){
            return null;
        }
        BSTNode<ITEM> temp = node;
        while(node.getLeft() != null){
            temp = temp.getLeft();
        }
        return temp.getValue();
    }
        
    public boolean isEmpty() {
        return root == null;
    }

    private BSTNode<ITEM> insert(BSTNode<ITEM> node, ITEM data) {
        if (node == null) {
            node = new BSTNode<>(data);
        } else {
            if (node.getValue().hashCode() >= data.hashCode()) {
                node.setLeft(insert(node.getLeft(), data));
            } else {
                node.setRight(insert(node.getRight(), data));
            }
        }
        return node;
    }

    public int findHeight(){
        return findHeight(root);
    }
    
    private int findHeight(BSTNode<ITEM> root) {
        if(root == null){
            return -1;
        }
        int lheight = findHeight(root.getLeft());
        int rheight = findHeight(root.getRight());
        return Integer.max(lheight, rheight) +1 ;
    }
    
    public ITEM findMin(){
        if(root == null){
            return null;
        }
        BSTNode<ITEM> temp = root;
        while(temp.getLeft() != null){
            temp = temp.getLeft();
        }
        return temp.getValue();
    }
    
    public ITEM findMax(){
        if(root == null){
            return null;
        }
        BSTNode<ITEM> temp = root;
        while(temp.getRight() != null){
            temp = temp.getRight();
        }
        return temp.getValue();
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(BSTNode<ITEM> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.getRight()) + countNodes(node.getLeft());
        }
    }

    public boolean search(ITEM data) {
        return search(data, root);
    }

    private boolean search(ITEM data, BSTNode<ITEM> node) {
        if(node == null){
            return false;
        }
        if (node.getValue().hashCode() == data.hashCode()) {
            return true;
        }
        if (node.getValue().hashCode() > data.hashCode() ) {
            if (search(data, node.getLeft())) {
                return true;
            }
        }
        if (node.getValue().hashCode() < data.hashCode() ) {
            if (search(data, node.getRight())) {
                return true;
            }
        }
        return false;
    }

    void inOrder(){
        inOrder(root);
    }
    
    private void inOrder(BSTNode<ITEM> node) {
        if(node != null){
            inOrder(node.getLeft());
            System.out.println(node.getValue());
            inOrder(node.getRight());
        }
    }
    
    public void processLevelOrderTraversal(){
        BSTNode temp = root;
        Queue<BSTNode<ITEM>> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            BSTNode<ITEM> node = q.remove();
            System.out.println(node.getValue());
            if(node.getLeft() != null)
                q.add(node.getLeft());
            if(node.getRight() != null)
                q.add(node.getRight());
        }
    }
    
    public boolean isBST(){
        return isBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isBST(BSTNode<ITEM> node, int minval, int maxval){
        if(node == null){
            return true;
        }
        if(node.getValue().hashCode() >= minval &&
           node.getValue().hashCode() < maxval  &&
           isBST(node.getLeft(),minval,node.getValue().hashCode()) &&
           isBST(node.getRight(),node.getValue().hashCode(), maxval) ){
            return true;
        }
        return false;
    }
    
    void postOrder(){
        postOrder(root);
    }
    
    private void postOrder(BSTNode<ITEM> node) {
        if(node != null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getValue());
        }
    }
    
    void preOrder(){
        preOrder(root);
    }
    
    private void preOrder(BSTNode<ITEM> node) {
        if(node != null){
            System.out.println(node.getValue());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }
    
}

class BSTNode<ITEM> {

    ITEM value;
    BSTNode<ITEM> left;
    BSTNode<ITEM> right;

    public ITEM getValue() {
        return value;
    }

    public void setValue(ITEM value) {
        this.value = value;
    }

    public BSTNode<ITEM> getLeft() {
        return left;
    }

    public void setLeft(BSTNode<ITEM> left) {
        this.left = left;
    }

    public BSTNode<ITEM> getRight() {
        return right;
    }

    public void setRight(BSTNode<ITEM> right) {
        this.right = right;
    }

    public BSTNode(ITEM value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BSTNode() {
        this.value = null;
        this.left = null;
        this.right = null;
    }
}
