public class shortingsarching12 {
    public static void findp(int arr[],int n,int t){ //thise is code subarray sum equal to key
        if(t==n){
            return;
        }
        int sum=0,l=0,key=10;
        for(int i=t;i<n;i++){
            for(int j=t;j<=i;j++){
                sum=sum+arr[j];
                l++;
                if(l==4){
                if(sum==key){
                    for(int k=t;k<=i;k++){
                        System.out.print(arr[k]);
                    }
                    System.out.println("-> found the sum is equal to key");
                    return;
                }
            }
                //System.out.print(arr[j]);
            }
            sum=0;
            l=0;
           // System.out.println();
        }
        findp(arr,n,t+1);
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};
       int n=arr.length;
       int t=0;
       findp(arr, n, t); 
    }

}
