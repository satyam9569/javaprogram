public class shortingsarching11 {
   public static void main(String[] args) {
    int arr[]={1,4,5,6,10,9};
    int n=arr.length;
    int f=0;
    for(int i=n/2;i<n;i++){
        System.out.println(arr[i]+" ");
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                f=1;
            }
        }
    }
    if(f==0){
        System.out.println("array is shorted");
    }
    else{
        System.out.println("array is not shorted");
    }
   } 
}
