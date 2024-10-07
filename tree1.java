public class tree1{
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
    static class binareytree{
         static int idx=-1;
        public static Node bulildtree(int node[]){
            idx++;
            Node newnode=new Node(node[idx]);
            if(node[idx]==-1){
                return null;
            }
            newnode.left=bulildtree(node);
            newnode.right=bulildtree(node);
            return newnode;
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void posteorder(Node root){
            if(root==null){
                return;
            }
            posteorder(root.left);
            posteorder(root.right);
            System.out.print(root.data+" ");
        }
    }
        public static void main(String[] args) {
           //binareytree tree=new binareytree();
           int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
           binareytree tree=new binareytree();
           Node root=tree.bulildtree(arr);
          // System.out.println(root.data);
          tree.preorder(root);
          System.out.println();
          tree.inorder(root);
          System.out.println();
          tree.posteorder(root);
        }
}
