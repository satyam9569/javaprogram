public class bst {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val); 
        }
        return root;
    }
    public static void inoder(Node root){
        if(root==null){
            return;
        }
        inoder(root.left);
        System.out.println(root.data);
    inoder(root.right);
    }
    public static void serchnode(Node root,int key){
        if(root==null){
            System.out.println("not found");
            return;
        }
        if(root.data>key){
            serchnode(root.left,key);
        }
        else if(root.data==key){
            System.out.println("key is found");
            return;
        }
        else{
            serchnode(root.right, key);
        }
    }
    public static Node deletenode(Node root,int val){
        if(root.data>val){
            root.left=deletenode(root.left, val);
        }
       else if(root.data<val){
            root.right=deletenode(root.right, val);
        } 
        else{
            if(root.left==null&&root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
           else if(root.right==null){
                return root.left;
            }
            Node is=inoderSucesor(root.right);
            root.data=is.data;
            root.right=deletenode(root.right, is.data);
        }
        return root;
    }
    public static Node inoderSucesor(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
}
    public static void main(String[] args) {
        int values[]={5,4,6,8,3,2};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
   //inoder(root);
   // System.out.println();
      //  serchnode(root, 8);
  deletenode(root, 5);
      inoder(root);
      System.out.println();
    }
}
