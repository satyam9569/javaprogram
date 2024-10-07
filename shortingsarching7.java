public class shortingsarching7 {
    public static void main(String[] args) {  //it is code of inverse array
       int arr[]={1,5,2,3,7,8} ;              //agre given array allredy accending order me ho to zero hoga
       int n=arr.length;                       //nhi to phale inverse array nikaln hoge
       int count=0;
       for(int i=0;i<n;i++){
        for(int j=n/2;j<n;j++){
            if(arr[i]>arr[j]&&i<j){
                System.out.println(arr[i]+","+arr[j]);
                count++;
            }
        }
       }
       System.out.println(count);
    }
}
