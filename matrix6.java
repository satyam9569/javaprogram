import java.util.Scanner;

public class matrix6 {
    public static void main(String[] args) {
        int arr[][]=new int[6][6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(i>0&&i<=4&&j>0&&j<=4){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                }
                
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
