/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yokukuma
 */
public class BinaryTree<ITEM> {

    BTNode<ITEM> root = null;

    public BinaryTree() {
    }

    // Function to insert data in tree
    public void insert(ITEM data) {
        root = insert(root, data);
    }

    // Funstion to check if tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Function to insert data recursively 
    private BTNode<ITEM> insert(BTNode<ITEM> node, ITEM data) {
        if (node == null) {
            node = new BTNode<>(data);
        } else {
            if (node.getLeft() != null) {
                node.setLeft(insert(node.getLeft(), data));
            } else {
                node.setRight(insert(node.getRight(), data));
            }
        }
        return node;
    }

    // Function tocount number of nodes
    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(BTNode<ITEM> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.getRight()) + countNodes(node.getLeft());
        }
    }

    List<ITEM> rootToLeafSum(int sum) {
        List<ITEM> ls = new ArrayList<>();
        rootToLeafSum(root, sum, ls);
        return ls;
    }

    private boolean rootToLeafSum(BTNode<ITEM> root, int sum, List<ITEM> ls) {
        if (root == null) {
            return false;
        }
        
        if (root.getLeft() == null && root.getRight() == null) {
            if (root.getValue().hashCode() == sum) {
                System.out.println("sum is:1"+sum);
                ls.add(root.value);
                return true;
            } else {
                System.out.println("reched here"+sum);
                System.out.println("value is: "+ root.getValue().hashCode());
                return false;
            }
        }
        if (rootToLeafSum(root.getLeft(), sum - root.getValue().hashCode(), ls)) {
            System.out.println("sum is2:"+sum);
            ls.add(root.value);
            return true;
        }
        if (rootToLeafSum(root.getRight(), sum - root.getValue().hashCode(), ls)) {
            System.out.println("sum is3:"+sum);
            ls.add(root.value);
            return true;
        }
        return false;
    }

    public boolean search(ITEM data) {
        return search(data, root);
    }

    // Function to search element in tree
    private boolean search(ITEM data, BTNode<ITEM> node) {
        if (node.getValue() == data) {
            return true;
        }
        if (node.getLeft() != null) {
            if (search(data, node.getLeft())) {
                return true;
            }
        }
        if (node.getRight() != null) {
            if (search(data, node.getRight())) {
                return true;
            }
        }
        return false;
    }

    // Function to inorder traversal 
    void inOrder() {
        inOrder(root);
    }

    private void inOrder(BTNode<ITEM> node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getValue());
            inOrder(node.getRight());
        }
    }

    // Function to postorder traversal 
    void postOrder() {
        postOrder(root);
    }

    private void postOrder(BTNode<ITEM> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getValue());
        }
    }

    // Function to preorder traversal 
    void preOrder() {
        preOrder(root);
    }

    private void preOrder(BTNode<ITEM> node) {
        if (node != null) {
            System.out.println(node.getValue());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

}

class BTNode<ITEM> {

    ITEM value;
    BTNode<ITEM> left;
    BTNode<ITEM> right;

    public ITEM getValue() {
        return value;
    }

    public void setValue(ITEM value) {
        this.value = value;
    }

    public BTNode<ITEM> getLeft() {
        return left;
    }

    public void setLeft(BTNode<ITEM> left) {
        this.left = left;
    }

    public BTNode<ITEM> getRight() {
        return right;
    }

    public void setRight(BTNode<ITEM> right) {
        this.right = right;
    }

    public BTNode(ITEM value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BTNode() {
        this.value = null;
        this.left = null;
        this.right = null;
    }
}
