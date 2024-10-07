public class rotedarray {
    public static void show(int a[],int n){
        int arr=a.length;
       int l=0;
       int h=n;
      // n=n%arr;
      if(n>=0&&n<=3){
        while(l!=arr-n){
            int temp=a[h];
            a[h]=a[l];
            a[l]=temp;
            h++;
            l++;
            }
      }
      else{
        while(l!=n){
            int temp=a[h];
            a[h]=a[l];
            a[l]=temp;
            if(h==5){
                h=n;
                h--;
            }
            h++;
            l++;
            }
      }
        for(int i=0;i<arr;i++){
            System.out.println(a[i]);
       } 
    }
        
        //int l=0;
        //int h=arr-1;
        //while(l<h){
         //   int temp=a[l];
           // a[l]=a[h];
            //a[h]=temp;
            //l++;
            //h--;
        //}
        //for(int i=0;i<arr;i++){
        //System.out.println(a[i]);
   // }
  
   public static void main(String[] args) {
    int a[]={1,2,3,4,5,6};
    int n=1;
     show(a,n);

   }
}