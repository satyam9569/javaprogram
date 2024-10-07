public class shorting5 {
    public static void main(String[] args) {   //thise is a code of one number press the user if any two nuber difrrence is equal to the nuber return pare
        int arr[]={3,5,6,9,8};
        int k=3,f=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
           if(arr[i]-arr[j]==k||arr[i]-arr[j]==-k){
            f=1;
            System.out.println("value is-> "+k);
            System.out.println("("+arr[i]+","+arr[j]+")");
            return;
           }
            }
        }
        if(f==0){
            System.out.println("no any pare found");
        }
    }
}
