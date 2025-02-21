package com.telran.prof.lessontwelve;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *          1
 *       /     \
 *    2           3
 *  /  \         /  \
 * 4    5       6    7
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

        // root
        System.out.println("BFS : ");
        breadthFirstSearch(root);
        System.out.println("\nDFS inorder : ");
        inorderDFS(root);
        System.out.println("\nDFS preorder : ");
        preorderDFS(root);
        System.out.println("\nDFS postorder : ");
        postorderDFS(root);

        System.out.println(getTreeSum(root));

    }

    // BFS - алгоритм поиска в ширину(алгоритм обхода дерева по уровням)
    // 1 2 3 4 5 6 7
    public static void breadthFirstSearch(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);  //1
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); // 1 2 3 4 5
            System.out.print(node.getValue() + " ");

            if (node.getLeft() != null) {
                queue.add(node.getLeft()); //2  // 3 4 // 4 5 6
            }
            if (node.getRight() != null) {
                queue.add(node.getRight()); // 2  3 // 3 4 5 // 4 5 6 7
            }
            //5 6 7 //6 7
        }
    }

    //DFS - depth first search (алгоритм поиска в глубину, рекурсивный алгоритм обхода дерева)

    //Inorder : Left - Root - Right  // 4 2 5 1 6 3 7
    public static void inorderDFS(TreeNode root) {
        if(root == null) {
            return;
        }

        inorderDFS(root.getLeft());

        System.out.print(root.getValue() + " ");

        inorderDFS(root.getRight());
    }

    //Preorder : Root - Left - Right  //1 2 4 5 3 6 7
    public static void preorderDFS(TreeNode root) {
        if(root == null) {
            return;
        }

        System.out.print(root.getValue() + " ");

        preorderDFS(root.getLeft());

        preorderDFS(root.getRight());
    }

    //Postorder : Left - Right - Root  // 4 5 2 6 7 3 1
    public static void postorderDFS(TreeNode root) {
        if(root == null) return;
        postorderDFS(root.getLeft());
        postorderDFS(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    // 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
    public static int getTreeSum(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return getTreeSum(root.getLeft()) + getTreeSum(root.getRight()) + root.getValue();
    }
}
