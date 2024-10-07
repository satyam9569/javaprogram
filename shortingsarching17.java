public class shortingsarching17 {
    public static void main(String[] args) {//it is a radix short
       int arr[]={904,46,5,74,62,1};         //first we cheack last digit if last digit are less then next digit no change else swap
       int n=arr.length;                     //scond we check the next value same
for(int i=0;i<n;i++){                   //904,46,5,74,62,1
        for(int j=i+1;j<n;j++){               //first swap time=1,62,904,74,46,5
            if(arr[i]%10>arr[j]%10){          //second time swap=1,5,46,74,62,904
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
     }
     for(int i=0;i<n;i++){                                                                 
        for(int j=i+1;j<n;j++){
            if(arr[i]/10>arr[j]/10){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
     }
     for(int i=0;i<n;i++){
        System.out.println(arr[i]);
     }
    }
}
