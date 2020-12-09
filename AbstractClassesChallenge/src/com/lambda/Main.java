package com.lambda;

public class Main {

    public static void main(String[] args) {

//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());

        // Create a string array to avoid typing lots of addItem instructions
//        String stringData = "Seattle Tacoma Bellingham Deming Orting Sequim Olympia Deming Vancouver";
//        String stringData = "5 7 3 9 8 2 1 0 4 6";
//        String[] data = stringData.split(" ");
//        for (String str : data) {
//            list.addItem(new Node(str));
//        }

//        list.traverse(list.getRoot());
//
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("5"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());
//
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());
//
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());
//
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());


        BST tree = new BST(null);

//        String stringData = "Seattle Tacoma Bellingham Deming Orting Sequim Olympia Deming Vancouver";
        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data = stringData.split(" ");
        for (String str : data) {
            tree.addItem(new Node(str));
        }

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());


        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());


        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

    }
}
