import java.util.*;
public class recursion5 {//it is a code of part of two array sum are equal are not 
    static int sum=0,sum1=0,f=1;
public static void printkeypad(int arr[],int n,int m){
    if(n==arr.length-2){
        System.out.println("not posible of two partion in array");
        return;
    }
   else if(m==arr.length){
    sum1=sum1+arr[n];
        if(sum1==sum){
            System.out.println("yes arry two part are equal-> "+sum1+"   scond part are->"+sum);
            return;
        }
        sum=0;
        n=n+1;
        m=n+1;
    }
    sum=sum+arr[m];
printkeypad(arr, n, m+1);
}
    public static void main(String args[]) {
        int arr[]={11,5,6,5,4,1,1};
       /* for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }*/
        int n=0,m=1;
        printkeypad(arr,n,m);
    }
}