/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disatvantages_M5.ImplementationComplexity;

/**
 *
 * @author Dell
 */
public class BinaryTreeSort {
    private Node root;

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void add(int value) {
        root = add(root, value);
    }

    private Node add(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = add(node.left, value);
        } else {
            node.right = add(node.right, value);
        }

        return node;
    }

    public void traverse() {
        traverse(root);
    }

    private void traverse(Node node) {
        if (node != null) {
            traverse(node.left);
            System.out.print(node.value + " ");
            traverse(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeSort bst = new BinaryTreeSort();
        int[] arr = { 10, 5, 15, 1, 7, 12, 17 };
        for (int i : arr) {
            bst.add(i);
        }
        bst.traverse();
    }
}
