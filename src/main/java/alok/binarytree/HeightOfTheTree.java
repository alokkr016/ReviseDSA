package alok.binarytree;

import static alok.binarytree.TreeImplementation.takeInputLevelWise;

public class HeightOfTheTree {


    public static void main(String[] args) {
        TreeNode root = takeInputLevelWise()    ;
        int height = heightOfTree(root);
        System.out.println("height of the tree " + height);
    }

    private static int heightOfTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int height = 1 +  Math.max(heightOfTree(root.left),heightOfTree(root.right));
        return height;
    }
}
