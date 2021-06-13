 
package BinaryTree;

public class BinaryTree {
    TreeNode root;
    public boolean isEmpty(){
        return (root==null);
        }      
//method insert data 
    public void insert(TreeNode input) {
     if (isEmpty()) {
         root = input;
     } else {
         // cari parent yg sesuai dan (kiri/kanan) 
         TreeNode current = root;
         TreeNode parent = null;
         boolean diKiri = true;
         while (current != null) {
             parent = current;
             // kalau data yang akan diinputkan lebih besar,  
             // bergerak ke kanan   
             if (current.data < input.data) {
                 current = current.right;
                 diKiri = false;
             // else gerak ke kiri 
             }
             else if(current.data > input.data){
                 current = current.left;
                 diKiri = true;
             }
             else {
                 System.out.println("data "+input.data+" sudah ada");
                 
                 break;
             }
         }
         // hubungkan ke parent  
         if (diKiri) {
             parent.left = input;
         } else {
             parent.right = input;
         }
     }
    }
    public void preOrder(){
        preOrder(root);
    }
    public void inOrder(){ 
        inOrder(root);   
    }   
    public void postOrder(){  
        postOrder(root);    
    }   
    public void preOrder(TreeNode root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    } 
    public void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public void postOrder(TreeNode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    //method mencari data
    public TreeNode search(int key) {
        TreeNode node = null;
        TreeNode current = root;
        // lakukan pencarian selama current bukan null 
        while (current != null) {
            if (current.data == key) {
                return node;
            } else {
                if (current.data < key) {
                    current = current.right;
                } else {
                    current = current.left;
                }
            }
        }
        return node;
    }
}
