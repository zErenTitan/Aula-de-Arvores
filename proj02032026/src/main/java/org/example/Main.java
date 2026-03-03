package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class Node{
        int value;
        Node left, right;
        Node(int value){this.value = value;}
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.right = new Node(20);

        System.out.println("Árvore criada:");
        System.out.println("Raiz: " + root.value);
        System.out.println("Filho esquerdo " + root.left.value);
        System.out.println("Árvore direito: " + root.right.value);


    }

}