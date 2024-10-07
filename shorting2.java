public class shorting2 {
    public static void main(String[] args) {  // two array short then find the comman element no repeted one vale to comman element
        int arr1[]={1,2,9,0,2,1};
        int arr2[]={5,9,3,1,7,1};
        int n1=arr1.length;
        int n2=arr2.length;
        for(int i=0;i<n1;i++){
            for(int j=i+1;j<n1;j++){
                if(arr1[i]>arr1[j]){
                    int temp=arr1[i];  //first array in asccending order
                    arr1[i]=arr1[j];
                    arr1[j]=temp;

                }
            }
        }
    
        for(int i=0;i<n2;i++){
            for(int j=i+1;j<n2;j++){
                if(arr2[i]>arr2[j]){
                    int temp=arr2[i];  //second array in asccending  order
                    arr2[i]=arr2[j];
                    arr2[j]=temp;

                }
            }
        }
        // remove the dublicate value
        int f=0,t=0;
        for(int i=0;i<n1;i++){
            f=0;
            for(int j=i+1;j<n1;j++){
                if(arr1[i]==arr1[j]){
                    f=1;
                    if(arr2[i]==arr2[j]){
                        f=1;
                    }
                }
            }
            //match the first and second array
            if(f==0){
                for(int j=0;j<n2;j++){
                    if(arr1[i]==arr2[j]){
                        t=1;
                        System.out.println(arr1[i]);
                    }
                }
            }
            if(t==0){
                System.out.println("no value match in first and scecond array");
            }
        }
    }
}
