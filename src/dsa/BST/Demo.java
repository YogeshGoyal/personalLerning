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
public class Demo {
    public static void main(String[] args) {
        System.out.println("output");
        BinarySearchTree<Integer> bt = new BinarySearchTree<>();
        bt.insert(123);
        bt.insert(23);
        bt.insert(134);
        bt.insert(12);
        bt.insert(45);
        bt.insert(124);
        bt.insert(135);
        bt.insert(320);
        bt.insert(319);
        bt.delete(234);
        //bt.inorder();
        bt.printLevel();
        System.out.println("zig zag print of tree is: ");
        bt.printZigZagUsing2Stack();
//        System.out.println("heee");
//        System.out.println("total element: "+ bt.countNode());
//        if(bt.searchNode(319) == Boolean.TRUE){
//            System.out.println("exist");
//        }else{
//            System.out.println("not exists");
//        }
//        
//        System.out.println("maxPathSum: "+bt.maxPathSum());
    }
}
