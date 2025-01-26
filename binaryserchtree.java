public class binaryserchtree {
    static int t=0;
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
    public static Node buildbst(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=buildbst(root.left, val);
        }
        else{
            root.right=buildbst(root.right, val);  
        }
        return root;
    }
    public static void inoder(Node root){//thise function work in display asscnding oder
        if(root==null){
            return;
        }
        inoder(root.left);
        System.out.println(root.data);
        inoder(root.right);
    }
    public static void serchbst(Node root,int key){//thise function work serch element present or not tree
        if(root==null){
            System.out.println("not found");
            return;
        }
        if(root.data==key){
            System.out.println("found the serch elment in tree");
            return;
        }
        if(root.data>key){
            serchbst(root.left,key);
        }
        else{
            serchbst(root.right,key);
        }
    }
    public static void findmineelement(Node root,int f){
              if(root==null){
                return ;
              }
              if(root.data<f){
                t=root.data;
                f=t;
              }
              findmineelement(root.left,f);
              findmineelement(root.right,f);
             
              //findmineelement(root.right,f);
        
    }
    public static void main(String[] args) {
        int arr[]={10,6,11,12,5,9,4,2};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=buildbst(root,arr[i]);
        }
//inoder(root);
//serchbst(root, 68);
t=root.data;
findmineelement(root,t);
System.out.println(t);

    }
}
