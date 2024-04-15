public class BuildTree2 {

    public static TreeNode getTree() {

        TreeNode root = new TreeNode(2);
        
        TreeNode left1 = new TreeNode(1);        
        left1.left = null;
        left1.right = new TreeNode(4);

        TreeNode right1 = new TreeNode(3);
        left1.left = null;
        left1.right = new TreeNode(7);

        root.left = left1;
        root.right = right1;

        return root;
    }
}