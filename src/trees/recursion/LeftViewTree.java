package trees.recursion;

public class LeftViewTree {

    private int level = 0;

    static class Tree{

        int data;
        Tree left, right;

        Tree(){

        }

        public Tree(int data){
            this.data = data;
        }
    }

    private void printLeftView(Tree root, int thisLevel){

        //base case here
        if(root == null) return;

        if(level < thisLevel){
            level = thisLevel;
            System.out.print("  "+root.data);
        }

        printLeftView(root.right, thisLevel + 1);
        printLeftView(root.left, thisLevel + 1);

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


