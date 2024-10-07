import java.util.*;
public class dublicate{
    public static void main (String arg[]){
        int arr[]={34,45,67,34,78,89};
        int length=arr.length;
        int temp=arr[0];
        for(int i=0;i<=5;i++){
            if(temp==arr[i+1]){
            i--;
           }
           System.out.println(arr[i]);

   }
      //  for(int i=0;i<=4;i++){
        //    System.out.println(arr[i]);
       // }
    }
}