import java.util.*;

public class practice1
{
  public static void show(int a[],int n)
  {
    //int n=5;
    if(n==4){
      return;
    }
    for(int i=0;i<=3;i++){
      for(int j=n;j<=i;j++)
      {
      //  show(a,n+1);
      //return;
         System.out.print(a[j]);
      }
      System.out.println();
      }
      show(a,n+1);
      //return;
}
//public class practice1{
public static void main(String arg[])
{
  int a[]={1,2,3,4};
      show(a,0);  
}
}

 