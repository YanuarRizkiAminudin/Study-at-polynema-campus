public class BinaryTree28 {
    Node28 root;
    public BinaryTree28(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }
  void add(int data) {
        if (isEmpty()) { // tree is empty
            root = new Node28(data);
        } else {
            Node28 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    }else{
                        current.left = new Node28(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    }else{
                        current.right = new Node28(data);
                        break;
                    }
                } else { // data is already exist
                    break;
                }
            }
        }
    }
    boolean find(int data){
        boolean result = false;
        Node28 current = root;
        while(current != null) {
            if(current.data == data){
                result = true;
                break;
            }else if(data < current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }
    void traversePreOrder(Node28 node) {
        if(node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
       }
    }
    void traversePostOrder(Node28 node) {
        if (node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node28 node){
        if(node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    Node28 getSuccessor(Node28 del){
        Node28 successor = del.right;
        Node28 successorParent = del;
        while(successor.left!=null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor!=del.right){
            successorParent.left =successor.right;
            successor.right = del.right;
        }
        return successor;
        }
    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node28 parent = root;
        Node28 current = root;
        boolean isLeftChild = false;
        while(current!=null){
            if(current.data==data){
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if(current==null){
        System.out.println("Couldn't find data!");
        return;
    } else {
        //if there is no child, simply delete it
        if(current.left==null&&current.right==null){
            if(current==root){
                root = null;
            } else{
                if(isLeftChild){
                    parent.left = null;
                } else{
                    parent.right = null;
                    } 
                }
            } else if(current.left==null){
                if(current==root){
                    root = current.right;
                } else {
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            } else if(current.right==null){//if there is 1 child (left)
                if(current==root){
                    root = current.left;
                } else {
                    if(isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else {
                Node28 successor = getSuccessor(current);
                if(current==root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left =successor;
                    }else{
                        parent.right =successor;
                    }
                    successor.left =  current.left;
                }
            }
        }
    }
}
