package com.telran.prof.lessoons.lesson12;

import java.util.LinkedList;
import java.util.Queue;

/**
 *          1
 *       /     \
 *     2        3
 *   /  \      /  \
 *  4    5    6    7
 */

public class TreeAppExample {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        root.setLeft(two);
        root.setRight(three);

        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        two.setLeft(four);
        two.setRight(five);

        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        three.setLeft(six);
        three.setRight(seven);

        System.out.println("BFS : ");
        breathFirstSearch(root);
        System.out.println("\nDFS inorder : ");
        inorderDFS(root);
        System.out.println("\nDFS preorder : ");
        preorderDFS(root);
        System.out.println("\nDFS postorder : ");
        postorderDFS(root);

        System.out.println();

        System.out.println(returnSum(root));
    }

    //BFS - алгоритм поиска в ширину(алгоритм обхода дерева по уровням)
    //1, 2, 3, 4, 5, 6, 7
    public static void breathFirstSearch(TreeNode root) {
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            System.out.print(node.getValue() + " ");
            if (node.getLeft() != null) {
                nodeQueue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                nodeQueue.add(node.getRight());
            }
        }
    }

    //DFS - depth first search(алгоритм поиска в глубину, рекурсивный алгоритм обхода дерева)

    //Inorder : Left - Root - Right //4 2 5 1 6 3 7
    public static void inorderDFS(TreeNode root) {
        if(root == null) {
            return;
        }

        inorderDFS(root.getLeft());
        System.out.print(root.getValue() + " ");
        inorderDFS(root.getRight());
        returnSum(root);
    }

    //Preorder : Root - Left - Right //1 2 4 5 3 6 7
    public static void preorderDFS(TreeNode root) {
        if(root == null) {
            return;
        }

        System.out.print(root.getValue() + " ");
        preorderDFS(root.getLeft());
        preorderDFS(root.getRight());
    }

    //Preorder : Left - Right - Root //4 5 2 6 7 3 1
    public static void postorderDFS(TreeNode root) {
        if(root == null) {
            return;
        }

        postorderDFS(root.getLeft());
        postorderDFS(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    public static int returnSum(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return root.getValue() + returnSum(root.getLeft()) + returnSum(root.getRight());
    }

}
