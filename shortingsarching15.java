public class shortingsarching15 {
    public static void main(String[] args) { //find the miden in runing data [5,15,1,3]->first we short and then find the value
        int arr[]={5,15,1,3};                 //first we hame all array asccending order
        int n=arr.length;                    // scecond cheak if value is even then->n/2+n/2+1
       int miden=0,t=0,f=0,m=0;              //third if value is odd then->n/2th value
        int arr1[]=new int[23];
        for(int l=0;l<n;l++){
        for(int i=0;i<=l;i++){
            for(int j=i+1;j<=l;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
            for(int k=0;k<=l;k++){
                //System.out.print(arr[k]+" ");
                if(l==0){
                    miden=arr[k];
                    break;
                }
                if(l==1){
                    miden=miden+arr[k];
                    f=1;
                }
                else{
                    if(l%2==0){
                        miden=arr[l/2];
                        f=0;
                        break;
                    }
                    else{
                        int m1=arr[l/2];
                        int m2=arr[(l/2)+1];
                         miden=m1+m2;
                         m1=0;
                         m2=0;
                         f=1;
                         break;
                    }
                }

            }
            if(f==1){
                miden=miden/2;
            }
              arr1[t]=miden;
                t++;
                miden=0;
}
for(int i=0;i<t;i++){
    System.out.print(arr1[i]+" ");
}
    }
}