package alok.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {

    public static TreeNode<Integer> takeInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the root of the tree: ");
        int data = in.nextInt();
        if (data == -1) {
            return null;
        }
        TreeNode<Integer> root = new TreeNode<>(data);
        System.out.println("Enter the number of the children for the root: " + data + ": ");
        int numberOfChildren = in.nextInt();
        while (numberOfChildren > 0) {
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
            numberOfChildren--;
        }

        return root;
    }

    public static void printTree(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        String result = root.data + " ";
        for (int i = 0; i < root.children.size(); i++) {
            result += " " + root.children.get(i).data;
        }

        System.out.println(result);
        for (int i = 0; i < root.children.size(); i++) {
            printTree(root.children.get(i));
        }

    }

    public static void printTreeLevelWise(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode<Integer> temp = queue.remove();
            String result = temp.data + " ";
            for (int i = 0; i < temp.children.size(); i++) {
                result += temp.children.get(i).data + " ";
                queue.add(temp.children.get(i));
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        printTreeLevelWise(root);
    }

    private static TreeNode<Integer> takeInputLevelWise() {
        Scanner in = new Scanner(System.in);
        int data = in.nextInt();
        if (data == -1) {
            return null;
        }
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        TreeNode<Integer> treeNode = new TreeNode<>(data);
        queue.add(treeNode);
        while (!queue.isEmpty()){
            TreeNode<Integer> temp = queue.remove();
            System.out.println("Enter the number of the child for root " + temp.data);
            int noOfChildren = in.nextInt();
            while (noOfChildren > 0){
                int child = in.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                temp.children.add(childNode);
                queue.add(childNode);
                noOfChildren--;
            }
        }
        return treeNode;
    }

}





























