import javax.swing.plaf.synth.SynthPasswordFieldUI;
import java.util.*;

public class printallcombination {
    public static void show(int arr[],int k,int t,int n){
        int count=1;
      if(count==2){
        return;
      }
       // int count=1;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){  
                if(i>=n){
            int temp=arr[t];
                arr[t]=arr[k];
                arr[k]=temp;
                }
        System.out.print(arr[j]);
        }
        k++;
    System.out.println();
    }
    count++;
  show(arr,3,1,0);
  show(arr,4,2,0);
   
}
    

    public static void main(String[] args) {
        int t=2;
        int k=2;
        int arr[]={1,2,3,4,5};
int n=1;
        show(arr,2,2,1);
    }
}

        
