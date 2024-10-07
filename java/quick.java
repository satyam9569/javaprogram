public class quick{
    public static int partin(int arr[],int lower,int high){
        int pivat=arr[high];
        int i=lower-1;
        for(int j=lower;j<high;j++){
            if(arr[j]<pivat){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivat;
        arr[high]=temp;
        return i;
    }
    public static void quicksort(int arr[],int lower,int high){
        if(lower<high){
            int pidx=partin(arr,lower,high);
            quicksort(arr,lower,pidx-1);
            quicksort(arr,pidx+1,high);
        }
    }
    public static void main(String args[]){
        int arr[]={ 6,3,5,7,8};
        int n=arr.length;
        quicksort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");

        }
        System.out.println();
    }

}