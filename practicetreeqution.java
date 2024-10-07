import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class practicetreeqution {
    static int hightleft=0,hightright=0,arr[]=new int[10],t=0;
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
public static void leveloderrevers(Node root){
    int count=0;
    if(root==null){
        return;
    }
     Queue<Node>q=new LinkedList<>();
     Stack <Integer>st=new Stack<>();
     Stack <Integer>st1=new Stack<>();
     st.push(null);
     q.add(root);
     q.add(null);
     while(!q.isEmpty()){
        Node currnode=q.remove();
        if(currnode==null){
            //System.out.println();
            count++;
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
                st.push(null);
            }
        }else{
            //System.out.print(currnode.data+" ");
            st.push(currnode.data);
            if(currnode.left!=null){
                q.add(currnode.left);
            }
              if(currnode.right!=null){
                q.add(currnode.right);
            }
        }        
     }
     while(!st.isEmpty()){//it is code of reverse the level oder traversal
        if(st.peek()!=null){
            st1.push(st.pop());
        }
        else{
            while(!st1.isEmpty()){
                System.out.print(st1.pop()+" ");
            }
            st.pop();
            System.out.println();
        }
     }
     System.out.println("how many long path->"+count);//find the long root

    }
    public static void subtree(Node root){//it is code of given tree if subtree are match the return true or not return false;
        if(root==null){
            return;
        }
        if(root.data==2&&root.left.data==4&&root.right.data==5){
            System.out.println("true");
        }
        subtree(root.left);
        subtree(root.right);
    }
    public static void zigzag(Node root){//even number level of tree print left->right and odd number print right->left
        int count=0;
        if(root==null){
            return;
        }
         Queue<Node>q=new LinkedList<>();
         Stack <Integer>st1=new Stack<>();
         q.add(root);
         q.add(null);
         while(!q.isEmpty()){
            Node currnode=q.remove();
            if(currnode==null){
                count++;
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
    
                }
            }else{
                if(count%2!=0){
                    st1.push(currnode.data);
                }
                else{
                    while(st1.size()!=0){
                        System.out.print(st1.pop()+" ");
                    }
                    System.out.print(currnode.data+" ");
                }
                if(currnode.left!=null){
                    q.add(currnode.left);
                }
                  if(currnode.right!=null){
                    q.add(currnode.right);
                }
            }
            }        
         } 
         public static void treerealimage(Node root) {
            if(root==null){
                return;
            }
            treerealimage(root.left);
            System.out.print(root.data+" ");
            treerealimage(root.right);
         }
         public static void treemirorimage(Node root) {//revrse the all data
            if(root==null){
                return;
            }
            treemirorimage(root.right);
            System.out.print(root.data+" ");
            treemirorimage(root.left);
         }
 public static void hightlefttree(Node root){//find the left sub tree hight
    if(root==null){
        //System.out.println(hightleft);
      return;
    }
    hightleft++;
     hightlefttree(root.left); 
 }
 public static void hightrighttree(Node root){//find the right sub tree hight
    if(root==null){
        //System.out.println(hightright);
      return;
    }
    hightright++;
     hightrighttree(root.right); 
 }
 public static void balancetree(){ //if hight of leftsubtree and right subtree defrnece is greter than one return false else return true
    if(hightleft-hightright<=1){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
 }
 public static void butomview(Node root){//thise function use to display only buttom node
    if(root==null){
        return;
    }
    if(root.left==null&&root.right==null){
        System.out.println(root.data);
    }
    butomview(root.left);
    butomview(root.right);
 }
 public static void numberofswap(Node root){//how to minumum swap need to binary tree to binary serch tree
                                           //i known binary serch when i travel in inoder traversl thane alwase give the result accnding oder
                                            //than i am first we travel in inoder and store the data in array and parform the swapping logig
          if(root==null){
            return;
          }
          numberofswap(root.left);
          arr[t]=root.data;
          t++;
          numberofswap(root.right);
 }
public static void topviwe(Node root,Node s){            //     10    only print the 10,20,40,30,100
    if(root==null){                                        //   /  \
        return;                                          //    20     30
    }                                                     //   /  \   /  \
    topviwe(root.left,s);                                 //   40  60 90   100*/
    System.out.println(root.data);
    if(s==root){
        topviwe(root.right,s);
    }
}
public static void digonaltraversal(Node root,Node s){
    if(root==null){
        return;
    }
    System.out.println(root.data); 
    if(root==s){
        digonaltraversal(root.right,s);
    }
    digonaltraversal(root.left,s);
    s=;
    digonaltraversal(root.right,s);

}
public static void bundarytravrsal(Node root,Node s){
    if(root.left==null){                                      
        return;                                          
    }  
    System.out.println(root.data);                                                   
    bundarytravrsal(root.left,s);                                 
    if(s==root){
    butomview(root);
        bundarytravrsal(root.right,s);
    }
}
    }
    
public static void main(String[] args) {
int data[]={1,2,4,7,-1,-1,8,11,-1,-1,-1,5,-1,-1,3,6,10,-1,-1,9,-1,-1,-1};
binarytree tree=new binarytree();
Node root=tree.buildtree(data);
// System.out.println(root.data);
// tree.preoder(root);
//tree.leveloderrevers(root);
//tree.subtree(root);
//tree.zigzag(root);
//tree.treerealimage(root);
//System.err.println();
//tree.treemirorimage(root);
//tree.hightlefttree(root);
//tree.hightrighttree(root);
//tree.balancetree();
//tree.butomview(root);
/*tree.numberofswap(root);
int countswap=0,f=0;
for(int i=0;i<t;i++){
    for(int j=i+1;j<t;j++){ 
        if(arr[i]>arr[j]){
            int k=arr[i];
            arr[i]=arr[j];
            arr[j]=k;
            f=1;
        }
    }
    if(f==1){
        countswap++;
    }
}
System.out.println(countswap);*/ //find the minumum swap convert the binary serch tree
Node s=root;
tree.topviwe(root,s);
//tree.digonaltraversal(root,s);
//tree.bundarytravrsal(root,s);
}
}
