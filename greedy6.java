public class greedy6 {
   public static void main(String[] args) { //step 1->{1,2,8,4}->first we even postion per sabse choti value and odd postion per badi value put
    int arr[]={10,12,15};                   //step 2->(1,8,2,4)->feer hame(1-8+8-2+2-4+4-1)->14;math.abs nigatve value positive
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(i%2==0){
          if(arr[i]>arr[j]){
            int n=arr[i];
            arr[i]=arr[j];
            arr[j]=n;
          }
        }
        else{
            if(arr[i]<arr[j]){
                int n=arr[i];
                arr[i]=arr[j];
                arr[j]=n;
        }
        }
    }
    }
       /* for(int i=3;i>=1;i--){
           int n=arr[i];
           arr[i]=arr[i-1];
           arr[i-1]=n;
    }*/
    int sum=0;
    for(int i=0;i<arr.length;i++){
       if(i<arr.length-1){
      sum=sum+Math.abs(arr[i]-arr[i+1]);
       } 
       else{
        sum=sum+(arr[i]-arr[0]);
       }
    }
    System.out.println(sum);
   } 
}
