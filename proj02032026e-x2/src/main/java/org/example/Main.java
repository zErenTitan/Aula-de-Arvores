package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static class Node{
        int value;
        Node left, right;
        Node(int value){this.value = value;}
    }
    static void pre0rder(Node n){
        if (n == null) return;
        System.out.println(n.value + " ");
        pre0rder(n.left);
        pre0rder(n.right);

    }

    static void in0rder(Node n){
        if (n == null) return;
        in0rder(n.left);
        System.out.println(n.value + " ");
        in0rder(n.right);
    }

    static void post0rder(Node n){
        if (n == null) return;
        post0rder(n.left);
        post0rder(n.right);
        System.out.println(n.value + " ");

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(20);

        System.out.println("Pre0rder: ");
        pre0rder(root);
        System.out.println();

        System.out.println("In0rder: ");
        in0rder(root);
        System.out.println();

        System.out.println("Post0rder: ");
        post0rder(root);
        System.out.println();

    }
}