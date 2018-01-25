/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.BST;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

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

    public int findHeight() {
        return findHeight(root);
    }

    private int findHeight(Node<E> root) {
        if (root == null) {
            return -1;
        }
        int lheight = findHeight(root.getLeft());
        int rheight = findHeight(root.getRight());
        return Integer.max(lheight, rheight) + 1;
    }

    public E findMin() {
        if (root == null) {
            return null;
        }
        Node<E> temp = root;
        while (temp.getLeft() != null) {
            temp = temp.getLeft();
        }
        return temp.getData();
    }

    public E findMax() {
        if (root == null) {
            return null;
        }
        Node<E> temp = root;
        while (temp.getRight() != null) {
            temp = temp.getRight();
        }
        return temp.getData();
    }

    public int findMinDepth() {
        return findMinDepth(root);
    }

    private int findMinDepth(Node<E> node) {
        if (node == null) {
            return 0;
        }
        int lheight = findMinDepth(node.getLeft());
        int rheight = findMinDepth(node.getRight());
        return Integer.min(lheight, rheight) + 1;
    }

    public int maxPathSum() {
        return maxPathSum(root, Integer.MIN_VALUE);
    }

    private int maxPathSum(Node<E> node, int sum) {
        if (node == null) {
            return 0;
        }
        if (node.getLeft() == null && node.getRight() == null) {
            return node.getData().hashCode();
        }
        int lsum = maxPathSum(node.getLeft(), sum);
        int rsum = maxPathSum(node.getRight(), sum);
        return Integer.max(lsum, rsum) + node.getData().hashCode();
    }

    /**
     * this method will be used to check if given tree is BST
     */
    public boolean isBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node<E> node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if (node.getData().hashCode() >= min
                && node.getData().hashCode() < max
                && isBST(node.getLeft(), min, node.getData().hashCode())
                && isBST(node.getRight(), node.getData().hashCode(), max)) {
            return true;
        }

        return false;
    }

    public boolean searchNode(E element) {
        return searchNode(element, root);
    }

    private boolean searchNode(E element, Node<E> node) {
        if (node == null) {
            return false;
        }
        if (node.getData().hashCode() == element.hashCode()) {
            return true;
        }
        if (node.getData().hashCode() > element.hashCode()) {
            if (searchNode(element, node.getLeft())) {
                return true;
            }
        } else {
            if (searchNode(element, node.getRight())) {
                return true;
            }
        }
        return false;
    }

    public int countNode() {
        return countNode(root);
    }

    private int countNode(Node<E> node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNode(node.getLeft()) + countNode(node.getRight());
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
        while (Boolean.TRUE) {
            int nodeCount = pq.size();
            if (nodeCount == 0) {
                break;
            }

            while (nodeCount > 0) {
                Node n = pq.remove();
                System.out.print(n.getData() + " ");
                if (n.getLeft() != null) {
                    pq.add(n.getLeft());
                }
                if (n.getRight() != null) {
                    pq.add(n.getRight());
                }
                nodeCount--;
            }
            System.out.println(" end");
        }

    }

    public void printZigZagUsing2Stack() {
        if (root == null) {
            return;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                root = s1.pop();
                System.out.print(root.data + " ");
                if (root.left != null) {
                    s2.push(root.left);
                }
                if (root.right != null) {
                    s2.push(root.right);
                }
            }
            while (!s2.isEmpty()) {
                root = s2.pop();
                System.out.print(root.data + " ");
                if (root.right != null) {
                    s1.push(root.right);
                }
                if (root.left != null) {
                    s1.push(root.left);
                }
            }
        }
    }
    
    public void printZigZagUsing1Deque() {
        if (root == null) {
            return;
        }
        Deque<Node> d = new LinkedList<>();
        d.offerLast(null);
        d.offerFirst(root);
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        
        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                root = s1.pop();
                System.out.print(root.data + " ");
                if (root.left != null) {
                    s2.push(root.left);
                }
                if (root.right != null) {
                    s2.push(root.right);
                }
            }
            while (!s2.isEmpty()) {
                root = s2.pop();
                System.out.print(root.data + " ");
                if (root.right != null) {
                    s1.push(root.right);
                }
                if (root.left != null) {
                    s1.push(root.left);
                }
            }
        }
    }
}

class Node<E> {

    E data;
    public Node<E> left;
    public Node<E> right;

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
