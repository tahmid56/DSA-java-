// class to create nodes
class Node {
    int key;
    Node left, right;

}

//class for binary tree
class BinaryTree {

    public Node createTree(int data){
        Node newNode = new Node();
        newNode.key = data;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    public void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.key);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.key);
        inOrder(root.right);
    }

    public int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        return root.key + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public int numberOfNodes(Node root){
        if(root==null){
            return 0;
        }
        return 1 + numberOfNodes(root.left) + numberOfNodes(root.right);
    }

    public int getNumbersOfLeaf(Node root){
        if(root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        
    }

    public void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.key);
    }

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        Node root = bt.createTree(3);
        root.left = bt.createTree(7);
        root.left.left = bt.createTree(2);
        root.left.right = bt.createTree(6);
        root.left.right.left = bt.createTree(5);
        root.left.right.right = bt.createTree(11);
        root.right = bt.createTree(5);
        root.right.right = bt.createTree(9);
        root.right.right.left = bt.createTree(4);
//        bt.preOrder(root);
//        bt.inOrder(root);
//        bt.postOrder(root);
//        System.out.println(bt.sumOfNodes(root));
        System.out.println(bt.numberOfNodes(root));
    }

}
