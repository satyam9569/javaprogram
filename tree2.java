import java.util.*;
public class tree2 {
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
    public static class binarytree{
        static int idx=-1;
        public static Node buildtree(int data[]){
            idx++;
            if(data[idx]==-1){
                return null;
            }
            Node newnode=new Node(data[idx]);
            newnode.left=buildtree(data);
            newnode.right=buildtree(data);
            return newnode;
        }
        public static void preoder(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.data);
            preoder(root.left);
            preoder(root.right);
        }
        public static void leveloder(Node root){
            if(root==null){
                return;
            }
             Queue<Node>q=new LinkedList<>();
             q.add(root);
             q.add(null);
             while(!q.isEmpty()){
                Node currnode=q.remove();
                if(currnode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currnode.data+" ");
                    if(currnode.left!=null){
                        q.add(currnode.left);
                    }
                      if(currnode.right!=null){
                        q.add(currnode.right);
                    }
                }
                
             }
            
        }
    }  
    public static void main(String[] args) {
        int data[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree=new binarytree();
        Node root=tree.buildtree(data);
       // System.out.println(root.data);
       // tree.preoder(root);
        tree.leveloder(root);
    }
    
}
