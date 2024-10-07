public class shortingsarching8 { //marge two shorted array
    public static void main(String[] args) {
        int arr1[]={3,2,4,1,5};
        int arr2[]={6,7,9,10,8};
        int n1=arr1.length;
        int n2=arr2.length;
        int arr3[]=new int[23];
        int t=0;
        for(int i=0;i<n1;i++){
            for(int j=i+1;j<n1;j++){
                if(arr1[i]>arr1[j]){
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
            arr3[t]=arr1[i];
            t++;
        }
        for(int i=0;i<n2;i++){
            for(int j=i+1;j<n2;j++){
                if(arr2[i]>arr2[j]){
                    int temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
            arr3[t]=arr2[i];
            t++;
        }
        for(int i=0;i<t;i++){ 
            System.out.println(arr3[i]);
        }
    }
}
