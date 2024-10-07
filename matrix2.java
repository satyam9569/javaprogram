import java.util.Scanner;

public class matrix2 {
    public static void main(String[] args) {
          int arr[][]=new int[3][3];
System.out.println("enter the matrix input");
Scanner sc=new Scanner(System.in);                                       //input   output
for(int i=0;i<3;i++){                                                     //1 1 1   1 0 1
    for(int j=0;j<3;j++){                                                 //1 0 1   0 0 0
arr[i][j]=sc.nextInt();                                                   //1 1 1   1 0 1
                                                                
    }                                                               
}                                                                   
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){  
        if((i+j)%2!=0){
            System.out.print("0"+" ");
        }
        else{
            System.out.print(arr[i][j]+" ");
        }
    }
    System.out.println();
}                    
    }
}
