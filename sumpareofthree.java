public class sumpareofthree {
    public static void main(String[] args) {//find the paere of three and the calulte the sum and return
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int t=0,k=3,sum=0;
        for(int i=0;i<n-2;i++){
            for(int j=t;j<k;j++){
                System.out.print(arr[j]);
                sum=sum+arr[j];
            }
            System.out.println("->sum is the pare of three=="+sum);
            sum=0;
            t++;
            k++;
        }
    }
}
