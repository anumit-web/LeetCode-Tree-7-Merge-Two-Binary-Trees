/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("Merge Two Binary Trees");

        Solution solution = new Solution();

        BuildTree1 tree1 = new BuildTree1();
        TreeNode root1 = tree1.getTree();

        BuildTree2 tree2 = new BuildTree2();
        TreeNode root2 = tree1.getTree();

        TreeNode return_value = solution.mergeTrees(root1, root2);
        
        System.out.println("Output Tree = (Merge Two Binary Trees) = " + return_value); // how to print tree

    }

}
