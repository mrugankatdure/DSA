package trees.recursion;

public class LeftViewTree {

    /**
     * Print left view of Binary tree
     *              8
     *          4       9
     *       3     5
     *          4
     *     left view -> 8,4,3,4
     *
     *
     * Right view -> 8,9,5,4
     *
     */



    private int fugitiveLevel = 0;

    static class Tree{

        int data;

        Tree left, right;

        Tree(){

        }

        public Tree(int data){
            this.data = data;
        }
    }

    private void printLeftView(Tree root, int leadingLevel){

        //base case here
        if(root == null) return;

        if(fugitiveLevel < leadingLevel){
            fugitiveLevel = leadingLevel;
            System.out.print("  "+root.data);
        }

        /**
         * for right view, simply call root.right first followed by root.left in args
         */
        printLeftView(root.left, leadingLevel + 1);
        printLeftView(root.right, leadingLevel + 1);

    }


    public static void main(String[] args) {

        LeftViewTree.Tree leftViewTree = new LeftViewTree.Tree(10);
        leftViewTree.left = new Tree(9);
        leftViewTree.right = new Tree(11);

        leftViewTree.left.left = new Tree(8);
        leftViewTree.left.left.right = new Tree(9);

        LeftViewTree leftView = new LeftViewTree();
        leftView.printLeftView(leftViewTree, 1);


    }
}


