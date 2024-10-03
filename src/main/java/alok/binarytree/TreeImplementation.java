package alok.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class TreeImplementation {
    public static TreeNode takeInput(Scanner in) {
        int data = in.nextInt();

        if (data == -1) {
            return null;
        }

        TreeNode root = new TreeNode(data);
        root.left = takeInput(in);
        root.right = takeInput(in);

        return root;
    }

    public static TreeNode takeInputLevelWise() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the root: ");
        int data = in.nextInt();

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode treeNode = new TreeNode(data);
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            System.out.println("Enter the left node for " + temp.data + ": ");
            int left = in.nextInt();
            if (left != -1) {

                TreeNode leftNode = new TreeNode(left);
                temp.left = leftNode;
                queue.add(leftNode);
            }
            System.out.println("Enter the right node for " + temp.data + ": ");
            int right = in.nextInt();
            if (right != -1) {
                TreeNode rightNode = new TreeNode(right);
                temp.right = rightNode;
                queue.add(rightNode);
            }
        }

        return treeNode;
    }


    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        TreeNode root = takeInputDFS(in);
//        printTreeDFS(root);
        TreeNode root = takeInputLevelWise();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        preOrder(root);
//        printTreeLevelWise(root);
//        printTree(root);

    }

    private static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    private static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    private static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            String s = temp.data + " ";

            if (temp.left != null) {
                s += "l : " + temp.left.data + " ";
                queue.add(temp.left);
            }
            if (temp.right != null) {
                s += "r: " + temp.right.data + " ";
                queue.add(temp.right);
            }

            System.out.println(s);
        }
    }

    private static void printTreeLevelWise(TreeNode root) {
        if (root == null) {
            return;
        }

        String s = root.data + " ";
        if (root.left != null) {
            s += "l:" + root.left.data + " ";

        }

        if (root.right != null) {
            s += "r:" + root.right.data;

        }
        System.out.println(s);
        printTreeLevelWise(root.left);
        printTreeLevelWise(root.right);
    }


}
