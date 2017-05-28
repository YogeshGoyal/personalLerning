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
public class TreeDemo {
    public static void main(String[] args) {
        TreeNode<String> tree = new TreeNode<>();
        TreeNode<String> root = tree.addNode("Y");
        TreeNode<String> child1  = tree.addNode("A",root);
        TreeNode<String> child2  = tree.addNode("B",root);
        TreeNode<String> child3  = tree.addNode("B",root);
        TreeNode<String> child4  = tree.addNode("B",root);
        TreeNode<String> child11  = tree.addNode("a",child1);
        TreeNode<String> child21  = tree.addNode("b",child2);        
        tree.addNode("c",root);        
        tree.printtree(root);
//        for (TreeNode<String> treeNode : root.getChildren()) {
//            System.out.println("child of roots are: "+ treeNode.getData());
//        }

    }
}
