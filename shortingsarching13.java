public class shortingsarching13 {  //whit is sub array sum equal with 0
        public static void findp(int arr[],int n,int t){
            if(t==n){
                return;
            }
            int sum=0;
            for(int i=t;i<n;i++){
                for(int j=t;j<=i;j++){
                    sum=(sum+arr[j]);
                    //System.out.print(arr[j]);
                }
                    if(sum==0){
                        for(int k=t;k<=i;k++){
                            System.out.print(arr[k]+" ");
                        }
                        System.out.println("-> found the sum is equal to key");
                    }
                   // System.out.println();
                      sum=0;
                }
            findp(arr,n,t+1);
        }
        public static void main(String[] args) {
           int arr[]={1,2,-3,3,-1,-1};
           int n=arr.length;
           int t=0;
           findp(arr, n, t); 
        }
    
    }
     