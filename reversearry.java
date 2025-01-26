import java.util.*;
public class reversearry {
    
        public static void reverse(int arr[]){
            int l=0,h=3;
            while(l<h){
                int t=arr[l];
                arr[l]=arr[h];
                arr[h]=t;
                l++;
                h--;
            }
            for(int i=0;i<=3;i++){
                System.out.print(arr[i]);
            }
        }
        public static void main(String arg[]){
            int arr[]={1,2,3,4};
            reverse(arr);
        }
    
}
