public class recursion4 {//reverse array in recursion;
    static int f=1,t=0,k=0;
    public static void reverse(int arr[],int h,int l){
        if(l<h){ 
        int temp=arr[h];
        arr[h]=arr[l];
        arr[l]=temp;
        h--;
        l++;
        }else{
            return;
        }
        reverse(arr, h, l);
    }
    public static void removedublicat(int arr[],int n,int m){//remove the dublicate value in array
        if(n==arr.length-1){
            if(f==1){
                System.out.println(arr[n]);
            }
           return;
        }
       else if(m==arr.length){
            if(f==1){
         System.out.println(arr[n]);
            }
            f=1;
            n=n+1;
            m=n;
        }
        else if(arr[n]==arr[m]){
            f=0;
        }
        removedublicat(arr, n, m+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,6,5};
        int h=arr.length-1;
        int l=0;
        int n=0;
        int m=1;
     //   reverse(arr, h, l);
     //   for(int i=0;i<arr.length;i++){
     //       System.out.println(arr[i]);
     //   }
        removedublicat(arr,n,m);
    }
}
