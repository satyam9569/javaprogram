public class subarrayproduct {
        static class sub{
             public static void find(int a[],int n,int product){
                 if(n==3){
                     return;
                 }
                  for(int i=0;i<=3;i++){
                   for(int j=n;j<=i;j++){
                product=product*a[j];
                   }
                System.out.print(product);
                 product=1;
                 System.out.println();
                }
                 //System.out.println(product);
         
                find(a,n+1,1);
             }
         }
         public static void main(String[] args) {
             sub s=new sub();
             int a[]={1,2,3,4};
             int n=0;
             int product=1;
             s.find(a,n,product);
         }
     }
     
