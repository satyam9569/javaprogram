import java.util.Scanner;

public class matrix1 {
    public static void main(String[] args){
    int arr[][]=new int[8][4];
System.out.println("enter the matrix input");
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++){
    for(int j=0;j<4;j++){                                        // input
arr[i][j]=sc.nextInt();                                            //  1 2 3 4
                                                                    // 5 6 7 8
    }                                                               //  9 10 11 12
}                                                                   //  13 14 15 16 
int t=0;                                                             // 17 18 19 20
System.out.println("output of matrix");                            //  output
   for(int k=0;k<8;k++){                                                 //  1 
                                                                          // 5 2
       for(int i=k;i>=0;i--){                                              // 9 6 3
            for(int j=0;j<4;j++){                                          // 13 10 7 4
                if(i+j==t&&arr[i][j]!=0){                                  // 17 14 11 8 
                System.out.print(arr[i][j]+" ");                           // 18 15 12
                }                                                           //19 16
               // System.out.print(arr[i][j]+" ");                          //20
            }
    }
        t++;
        System.out.println();
    }
    }
}
