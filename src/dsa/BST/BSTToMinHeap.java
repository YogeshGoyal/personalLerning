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
public class BSTToMinHeap {

    class Node<Key> {

        Node left;
        Node right;
        int data;

        public Node(int element) {
            left = null;
            right = null;
            data = element;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

    }
    Node root = null;

    void insert(int element) {
        root = insert(element, root);
    }

    private Node insert(int element, Node base) {
        if (base == null) {
            base = new Node(element);
        } else {
            if (base.getData() >= element) {
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

    void inorder(Node node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.println(node.getData());
            inorder(node.getRight());
        }
    }

    public Node reverseInOrder() {
        return reverseInOrder(root, null);
    }

    public Node reverseInOrder(Node node, Node llPointer) {
        if (node != null) {
            llPointer = reverseInOrder(node.right, llPointer);
            node.setRight(llPointer);
            if (llPointer != null) {
                llPointer.setLeft(null);
            }
            llPointer = node;
            llPointer = reverseInOrder(node.left, llPointer);
        }
        return llPointer;
    }

    public Node createHeapFromSortedLinkedList(Node headOfLinkedList) {

        if (headOfLinkedList == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();

        //set the head of linkedlist as the root of heap
        Node rootOfHeap = headOfLinkedList;

        //Move the head of linked list to next element
        headOfLinkedList = headOfLinkedList.right;

        //Break the link
        rootOfHeap.right = null;

        //Enqueue the root node in queue
        queue.add(rootOfHeap);

        //Iterate until headOfLinkedList is not null
        while (headOfLinkedList != null) {
            Node parent = queue.poll();

            //Get the left child from the linked list.In this case left child is the head of the linked list
            Node leftChild = headOfLinkedList;

            //Move the head to next element
            headOfLinkedList = headOfLinkedList.right;

            parent.left = leftChild;

            //Enqueue left child in queue so that it's can act as parent in next iteration
            queue.add(leftChild);

            //If the linked list has more elements then try to set the right child as well
            if (headOfLinkedList != null) {

                //Get the right Child from the linked list.
                Node rightChild = headOfLinkedList;

                //Move the head to next element
                headOfLinkedList = headOfLinkedList.right;

                //Reset the link
                rightChild.right = null;

                //Put the right child into parent
                parent.right = rightChild;
            }

        }

        return rootOfHeap;
    }

    	private static void printLevelOrder(Node aNode) {

		if(aNode == null){
			return;
		}
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(aNode);
		
		while(!queue.isEmpty()){
			
			Node node = queue.poll();
			
			if(node != null){
				
				System.out.print(node.getData());
				
				queue.add(node.getLeft());
				queue.add(node.getRight());
				System.out.print("\t");
			}
		}
	}
    public static void main(String[] args) {
        BSTToMinHeap bt = new BSTToMinHeap();
        bt.insert(123);
        bt.insert(23);
        bt.insert(34);
        bt.insert(234);
        bt.insert(345);
        bt.insert(321);
        bt.insert(2);
        bt.insert(320);
        bt.insert(319);
        //bt.inorder();

        // below method will convert given BST to linkedlist and head will be smallest element
        Node headOFLinkedList = bt.reverseInOrder();
        // Create a Heap from a sorted linked list
        Node rootOfHeap = bt.createHeapFromSortedLinkedList(headOFLinkedList);
        bt.printLevelOrder(rootOfHeap);
        
    }
}
