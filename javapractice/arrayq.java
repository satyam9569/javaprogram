import java.util.*;

public class arrayq{
    public static void main(String arg[]){
        int arr[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            System.out.println("["+arr[i]+"]");
              sum=sum+i;
        }
        System.out.println(sum);
    }
}