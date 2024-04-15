public class BuildTree1 {

    public static TreeNode getTree() {

        TreeNode root = new TreeNode(10);        

        TreeNode left1 = new TreeNode(3);        
        left1.left = new TreeNode(5);
        left1.right = null;

        root.left = left1;
        root.right = new TreeNode(2);


        return root;

    }
}