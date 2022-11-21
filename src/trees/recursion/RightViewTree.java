package trees.recursion;

public class RightViewTree {

    /**
     * Print right view of Binary tree
     *              8
     *          4       9
     *       3     5
     *          4
     *     right view -> 8,9,5,4
     *
     *
     *

     */



    private int fugitiveLevel = 0;

    static class Tree{

        int data;

        RightViewTree.Tree left, right;

        public Tree(int data){
            this.data = data;
        }
    }

    private void printRightView(RightViewTree.Tree root, int leadingLevel){

        //base case here
        if(root == null) return;

        if(fugitiveLevel < leadingLevel){
            fugitiveLevel = leadingLevel;
            System.out.print("  "+root.data);
        }

        /**
         * for right view, simply call root.right first followed by root.left in args
         */
        printRightView(root.right, leadingLevel + 1);
        printRightView(root.left, leadingLevel + 1);

    }


    public static void main(String[] args) {

        RightViewTree.Tree rightViewTree = new RightViewTree.Tree(10);
        rightViewTree.left = new RightViewTree.Tree(9);
        rightViewTree.right = new RightViewTree.Tree(11);

        rightViewTree.left.left = new RightViewTree.Tree(8);
        rightViewTree.left.left.right = new RightViewTree.Tree(9);

        RightViewTree rightView = new RightViewTree();
        rightView.printRightView(rightViewTree, 1);

    }
}
