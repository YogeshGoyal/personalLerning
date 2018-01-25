/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.BST;

/**
 *
 * @author yokukuma
 */
public class BSTFromPreOrder {
    public static void main(String[] args) {
        int pre[] = new int[]{10, 5, 1, 7, 40, 50};
        BST<Integer> bst = new BST<>();
        bst.formBSTFromPreOrder(pre);
        bst.inOrder();
        bst.addGreaterSum();
        System.out.println("after:\n\n");
        bst.inOrder();
    }
}

class BST<Key>{

    
    class Node<Key>{
        Node left;
        Node right;
        int data;
    }
    Node root = null;
    static int sum =0;

    void addGreaterSum(){
     addGreater(root);   
    }
    
    void addGreater(Node node){
        if(node == null){
            return;
        }
        addGreater(node.right);
        node.data= node.data + sum;
        sum = node.data;
        addGreater(node.left);
        
    }
    
    void formBSTFromPreOrder(int[] pre) {
        
        root = preorderUtil(pre,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    int pIindex =0;
    private Node preorderUtil(int[] pre, int index,int min,int max){
        if(pIindex>pre.length){
            return null;
        }
        int key = pre[pIindex];
        if(pre[pIindex] > min && pre[pIindex] < max){
            Node temp = new Node();
            
            temp.data = pre[pIindex];
            pIindex = pIindex+1;
            if(pIindex < pre.length){
                temp.left  = preorderUtil(pre, index, min, pre[pIindex-1]);
                temp.right = preorderUtil(pre, index, pre[pIindex-1], max);
            }
            return temp;
        }
        return null;
        
    }
    void inOrder(){
        inOrder(root);
    }
    void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    
}