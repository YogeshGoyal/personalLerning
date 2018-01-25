/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.tree;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author yokukuma
 */
class TreeNode<ITEM> {

    private ITEM value;
    private List<TreeNode<ITEM>> children;
    private TreeNode<ITEM> parent;
    public TreeNode() {
    }

    public TreeNode<ITEM> addNode(ITEM value, TreeNode<ITEM> node) {
        TreeNode<ITEM> newChild = new TreeNode<>();
        newChild.value = value;
        newChild.children = new LinkedList<>();
        newChild.setParent(node);
        node.children.add(newChild);
        return newChild;

    }

    public TreeNode<ITEM> addNode(ITEM value) {
        TreeNode<ITEM> newChild = new TreeNode<>();
        newChild.value = value;
        newChild.children = new LinkedList<>();
        return newChild;
    }

    public List<TreeNode<ITEM>> getChildren() {
        return children;
    }

    public ITEM getData() {
        return value;
    }

    public void setParent(TreeNode<ITEM> parent) {
        this.parent = parent;
    }

    public TreeNode<ITEM> getParent() {
        return parent;
    }

    public void printtree(TreeNode<ITEM> node) {
        System.err.println(node.value);
        List<TreeNode<ITEM>> child = node.children;
        if (child != null) {
            for (TreeNode<ITEM> treeNode : child) {
                printtree(treeNode);
            }
        }else{
            return;
        }
    }
}
