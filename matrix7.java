import java.util.*;
public class matrix7 {
    public static void main(String[] args) {
        int arr[][]=new int[6][6];
        Scanner sc=new Scanner(System.in);                       //input
        for(int i=0;i<4;i++){                                    //1 2 3 4
                                                                // 3 4 4 5
            for(int j=0;j<4;j++){                                //5 6 7 8
            arr[i][j]=sc.nextInt();                              //3 4 5 6
            }                                                    //output
        }                                                           //repeted in row vale ==4
        int f=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                     for(int k=j+1;k<4;k++) {
                        if(arr[i][j]==arr[i][k]){
                            f=1;
                            System.out.println("repeted value in row->"+arr[i][k]);
                        }

                     }
                    
                }
                
            }
            if(f==0){
                System.out.println("no vale repeted in any row");
            }
        }
    
}
