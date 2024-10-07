import java.util.Scanner;

public class matrix3 {
   public static void main(String[] args) {
          int arr[][]=new int[3][3];
System.out.println("enter the matrix input");
Scanner sc=new Scanner(System.in);                                       //input   output
for(int i=0;i<3;i++){                                                     //1 2 3   7 4 1
    for(int j=0;j<3;j++){                                                 //4 5 6   8 5 2
arr[i][j]=sc.nextInt();                                                   //7 8 9   4 6 3
                                                                
    }                                                               
} 
int t=0;
for(int k=0;k<3;k++){                                                                  
for(int i=2;i>=0;i--){
    for(int j=0;j<3;j++){  
          if(j==t){
            System.out.print(arr[i][j]+" ");
          }
        }
    }
    System.out.println();
    t++;
}                   
    }
}
 
