package trees.recursion;

class BinarySearchTree {

    protected int data;
    BinarySearchTree left, right;


    BinarySearchTree(){

    }

    BinarySearchTree(int data){
        this.data = data;
    }

}


/**
 * Helper class to BST
 */
public class CreateBinarySearchTree {

    BinarySearchTree root;


    public BinarySearchTree createTree(int data){
        root = insertElement(root, data);
        return root;
    }

    private BinarySearchTree insertElement(BinarySearchTree root, int data) {

        if(root == null){
            root = new BinarySearchTree(data);
            return root;
        }

        else if(data < root.data){
            root.left = insertElement(root.left, data);
        }else if(data > root.data){
            root.right = insertElement(root.right, data);
        }

        return root;
    }

    public static void main(String[] args) {
        //fill tree
        CreateBinarySearchTree searchTree = new CreateBinarySearchTree();
        searchTree.createTree(6);
        searchTree.createTree(5);
        searchTree.createTree(7);
        searchTree.createTree(4);
        searchTree.createTree(8);



    }
}
