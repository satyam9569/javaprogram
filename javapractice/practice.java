import java.util.*;
public class practice{
public static void main(String arg[]){
  int a[]={2,3,56,2,6,7,8,8,9,6};
  int k=3;
  int t=0;
  int arr= a.length;
  for(int i=t;i<arr-2;i++){
      for(int j=t;j<k;j++){
          System.out.print(a[j]+" ");
      }
      System.out.println();
      t++;
      k++;
  }
}
}