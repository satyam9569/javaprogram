import java.util.Scanner;

public class matrix4 {
    public static void main(String[] args) {
          int arr[][]=new int[3][3];
System.out.println("enter the matrix input");
Scanner sc=new Scanner(System.in);                                       //input   output
for(int i=0;i<3;i++){                                                     //1 2 3   //{1,2,3,6,7,8,9,4,5}
    for(int j=0;j<3;j++){                                                 //4 5 6   
arr[i][j]=sc.nextInt();                                                   //7 8 9  
                                                                
    }                                                               
}
int t1=0,t2=0;
for(int i=0;i<3;i++){                                                     
    for(int j=0;j<3;j++){ 
        if(i==1){
           // int t1=0,t2=0;//ek mathord hai swaping ka
            t1=arr[i][j];
            j++;
            t2=arr[i][j];
            j++;
            System.out.print(arr[i][j]+" ");
        }
        else{
        System.out.print(arr[i][j]+" "); 
        }
    }
        if (i==2) {
           System.out.print(t1+" "+t2); 
        }
}
    }
}
