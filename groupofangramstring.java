import java.util.Scanner;

public class groupofangramstring {
    public static void main(String[] args) {
          Scanner sc=new Scanner (System.in);                    //eat tea ten ate nat bat
                                                               //bat nat ate ten tea eat
        String str=sc.nextLine();
        String str1[]=new String[str.split(" ").length];
        str1=str.split(" ");
        int idx=str1.length;
        int l=0;
        int h=idx-1;
        while (l<h) {
            String temp=str1[l];
            str1[l]=str1[h];
            str1[h]=temp;
            l++;
            h--;
        }
        for(int i=0;i<idx;i++){
            System.out.println(str1[i]);
        }
    }
}                                                 //eat tea ten ate nat bat
                                                  //bat nat ate ten tea eat
                                              