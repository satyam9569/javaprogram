import java.util.*;
public class createarraylist {
    
    public  static class myarray{
        static int arr1[]=new int [2];
    static int size=0;
       public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
       
    }
    public static void  arraylisit(int val){
        int t=arr1.length;
        if(size==t){
        int []arr2=Arrays.copyOf(arr1, t);
        arr1=arr2;
        }
        arr1[size]=val;
        size++;
    }
    public static void main(String[] args) {
        myarray st =new myarray();
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
       st.show(arr);
       st.arraylisit(10);
       st.arraylisit(22);
       st.arraylisit(10);
       st.arraylisit(22);
       for(int i=0;i<size;i++){
        System.out.println(arr1[i]);
       }


    }}
}
