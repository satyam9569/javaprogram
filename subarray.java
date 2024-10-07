public class subarray {
   static class sub{
        public static void find(int a[],int n){
            if(n==4){
                return;
            }
           for(int i=0;i<=4;i++){
            for(int j=n;j<=i;j++){
                System.out.print(a[j]);
            }
            System.out.println();
           }
    
           find(a,n+1);
        }
    }
    public static void main(String[] args) {
        sub s=new sub();
        int a[]={1,2,3,4,5};
        int n=0;
        s.find(a,n);
    }
}
