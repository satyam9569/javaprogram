public class dublicate {
    public static void main(String[] args) {
        int a[]={1,2,3,4,2,1,3};
        int f=0;
        for(int i=0;i<=6;i++){
            f=0;
            for(int j=i+1;j<=6;j++){
               if(a[i]==a[j]){
                f=1;
                break;
               }
            }
            if(f==0){
                    System.out.println(a[i]);
                }          
    }
}
}
