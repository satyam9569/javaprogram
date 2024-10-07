import java.util.*;
public class buildtree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class cratetree{
        static int idx=-1;
        //build tree function
        public static Node build(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode =new Node(nodes[idx]);
            newnode.left=build(nodes);
            newnode.right=build(nodes);
            return newnode;
        }
    }
    //preorder traversal
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //posteorder traversal
    public static void posteorder(Node root){
        if(root==null){
            return;
        }
        posteorder(root.left);
        posteorder(root.right);
        System.out.print(root.data+" ");
    }
   //inorder traversal
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //levelorder traversal
    public static void levelorder(Node root){
        if(root==null){
            System.out.println("empaty");
        }
        Queue<Node>qe=new LinkedList<>();
        qe.add(root);
        qe.add(null);
        while (!qe.isEmpty()) {
            Node currnode=qe.remove();
            if(currnode==null){
                System.out.println();
            if(qe.isEmpty()){
                break;
            }
            else{
                qe.add(null);
            }
        }
        else{
            System.out.print(currnode.data+" ");
            if(currnode.left!=null){
                qe.add(currnode.left);
            }
              if(currnode.right!=null){
                qe.add(currnode.right);
            }
        }
    }            
    }
    //count all node all of the tree
    public static int countnode(Node root){
        if(root==null){
            return 0;
        }
        int leftnodes=countnode(root.left);
        int rightnodes=countnode(root.right);
        return leftnodes+rightnodes+1;
    }
    //sum of all the nodes
    public static int countnodesum(Node root){
        if(root==null){
            return 0;
        }
        int leftnodes=countnodesum(root.left);
        int rightnodes=countnodesum(root.right);
        return leftnodes+rightnodes+root.data;
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       cratetree tree=new cratetree();
       Node root=tree.build(nodes);
       //System.out.println(root.data);
       preorder(root); 
       System.out.println();
       posteorder(root);
       System.out.println();
       inorder(root);
       System.out.println();
levelorder(root);
System.out.println();
System.out.print(countnode(root));
System.out.println();
System.out.print(countnodesum(root));
    }
}
