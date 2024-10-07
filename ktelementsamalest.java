 import java.util.*;
 public class ktelementsamalest {
    public static void findthekthsamlest(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              if(arr[i]>arr[j]){//ascending order
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }//only one change than find the kth largest number
            }
        }
            System.out.println(arr[k]);
    }
    
    public static void main(String[] args) {
        int arr[]={10,2,4,6,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element and find the smallest elemnt");
        int k=sc.nextInt();
        findthekthsamlest(arr, k-1);
    }
}
