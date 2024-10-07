public class shortingsarching14 { //how to minumum swap to any array short
    public static void main(String[] args) {
        int arr[]={1,4,5,0,1};
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              if(arr[i]>arr[j]){
                count++;
              }
            }
        }
        System.out.println("thise is steps of swap shorted array->"+count);
    }
}
