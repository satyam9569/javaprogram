public class greedy7 {
    public static void main(String[] args) {  //swap in given user time;
       /*  int arr[]={1,2,5,6,9};
        int n=1;
        for(int i=n;i>=0;i--){
            if(i>0){
           int t=arr[i];
           arr[i]=arr[i-1];
           arr[i-1]=t;
            }
        }*/
        char arr[]={'a','a','a','b','c'};

        for(int i=1;i<arr.length;i++){
           for(int j=i;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                char t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                break;
            }
           } 
        }
        for(int i=0;i<arr.length;i++){
            if(arr[arr.length-1]!=arr[0]){
                System.out.println("thise is not posible");
                return;
            }
            else{
            System.out.println(arr[i]);
            }
    }
}
}
