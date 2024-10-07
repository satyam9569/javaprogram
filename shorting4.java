public class shorting4 {
   public static void main(String[] args) {                //thise code ciling and flor
    int k=2,f=0;
    int arr[]={9,1,9,2,3,6,9};
    int n1=arr.length;
    for(int i=0;i<n1;i++){
        for(int j=i+1;j<n1;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];  //first array in asccending order
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
    }
    for(int i=0;i<n1;i++){
      for(int j=i+1;j<n1;j++){
             if(arr[i]==arr[j]){
                f=1;
             }
      } 
      if(f==0){ 
       if(arr[i]>=k){
        System.out.println("cill ke value->"+arr[i]);
        if(i>0){
            System.out.println("floar ke value->"+arr[i-1]); 
            return;
        }
        System.out.println("floar ke value->"+arr[i]);
        return;
       }
      }
    }
   } 
}
