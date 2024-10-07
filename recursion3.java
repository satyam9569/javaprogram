
import java.util.*;
public class recursion3{
        public static void resc(char arr[],int n,int facctl){ //abc->permution of a srring->bca->bac->cba->cab->abc->acb
               if(n==arr.length){
                return;
               }
               for(int i=0;i<facctl;i++){
                    if(i<arr.length-1){
                    char t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                    }
                    for(int j=0;j<arr.length;j++){
                   System.out.print(arr[j]);
                }
                System.out.println();
            }
               resc(arr,n+1,facctl);
        }

        public static void main(String[] args) {
            int n=0;
             char arr[]={'a','b','c'};
            int fact=1;
            for(int i=arr.length;i>0;i--){
                fact=fact*i;
            }
            int facctl=fact/arr.length;
            System.out.println(facctl);
           resc(arr,n,facctl);
        }
    }
    