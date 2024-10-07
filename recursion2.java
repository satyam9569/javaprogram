public class recursion2 {
    public static void resc(int arr[],int n,int facctl){ //123->//->231->213->123->132->312->321->permution of  array->3!=6;
           if(n==arr.length){
            return;
           }
           for(int i=0;i<facctl;i++){
                if(i<arr.length-1){
                int t=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
                }
                for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]);
                }
            System.out.println();
            }
           
           resc(arr,n+1,facctl);
    }
    public static void main(String[] args) {
        int n=0;
        int arr[]={1,2,3,4};
        int fact=1;
        for(int i=1;i<=arr.length;i++){//calulate the factorial;
            fact=fact*i;
        }
        int facctl=fact/arr.length;
        resc(arr,n,facctl);
    }
}
