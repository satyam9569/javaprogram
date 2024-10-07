public class shorting6 {
   static void find(int arr[],int n){
    int maxcount=0;
    int idx=-1;
    for(int i=0;i<n;i++){                       //thise code is majorty of element kon sa element sabse jada baar aaya hai
        int count=0;                             //arry ke size ke half se jada hoga vhe hoga
        for(int j=0;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
       // System.out.println(arr[i]+" "+count);
            if(count>maxcount){
                maxcount=count;
                idx=i;
            }
        }
        if(maxcount>n/2){
            System.out.println(arr[idx]);
        }
        else{
            System.out.println("no majortiy alement found");
        }
    }
    public static void main(String[] args) {
       int arr[]={1,1,2,1,3,5,1};
       int n=arr.length;
       find(arr,n);
    }
   }

