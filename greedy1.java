public class greedy1 {//6,8,4,5,2,3->358+246=604
    public static void short1(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }
    static int t1=1,t2=0,s1=1,s2=0;
    public static void findminn(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            if(i%2==0){
        t2=t2+arr[i]*t1;
         t1=t1*10;
            }
            else{
                s2=s2+arr[i]*s1;
                s1=s1*10; 
            }
            
        }
        System.out.println("sum of two mine value->"+(t2+s2));
    }
    public static void main(String[] args) {
        int arr[]={6,8,4,5,2,3};
        short1(arr);
        findminn(arr);
    }
}
