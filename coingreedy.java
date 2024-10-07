public class coingreedy {
public static void show(int arr[],int n){
    int key=70,sum=0;;
    if(n==arr.length-1){
        return;
    }
    for(int i=n;i<arr.length;i++){
        for(int j=n;j<=i;j++){
            sum=sum+arr[j];
        }
        if(sum==key){
            for(int k=n;k<=i;k++){
                System.out.println(arr[k]);
            }
        }
            sum=0;
    
    }
    show(arr,n+1);
}
    public static void main(String[] args) {
    int arr[]={1,2,5,10,20,50,100,500,};//return 50,20;
    int n=0;
    show(arr,n);
    }

}
