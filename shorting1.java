public class shorting1 {
    public static void main(String[] args) {
        int arr1[]={1,2,9,0,2};
        int arr2[]={5,9,3,1,7};
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
                if(arr2[i]<arr2[j]){
                    int temp=arr2[i];  //second array in decending  order
                    arr2[i]=arr2[j];
                    arr2[j]=temp;

                }
            }                                               //jo key me value de jayege vha ya to jo key se badi hone chaye ya to equal jo do array
                                                                //hai ek accending order dusra descending order ager ek bhi index fail hota hai to
                                                                //false return karega
        }
        int k=7,f=0;
        for(int i=0;i<n1;i++){
            if(arr1[i]+arr2[i]>=k){
                f=1;
            }
            else{
                f=0;
                System.out.println("not match");
                break;
            }
        }
        if(f==1){
            System.out.println("match all index");
        }
    }
}
