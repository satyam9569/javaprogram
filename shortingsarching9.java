public class shortingsarching9 { //sum of pare of three is equal to key
    public static void main(String[] args) {
       int arr[]={1,2,5,6,7,8,9};
       int n=arr.length;
       int key=24;
       int t=3,f=0;
       int sum=0;
       for(int i=0;i<n-2;i++){
        for(int j=i;j<t;j++){
            sum=sum+arr[j];
        }
        if(key==sum){
            f=1;
            for(int j=i;j<t;j++){
                System.out.println(arr[j]);
            }
            System.out.println("sum is equal to->"+sum);
        }
        sum=0;
        t++;
       }
       if(f==0){
        System.out.println("no any pare found ");
       }
    }
}
