public class sumof1standsndequaltox {
 public static void main(String arg[]){
    int arr[]={1,2,3,4,5,6};
    int a=arr.length;
    int n=a/2;
    int x=7,f=0;
    for(int i=0;i<a;i++){
       if(arr[i]+arr[n]==x){
           f=1;
           break;
       }
    }
    if(f==1){
        System.out.println("true value");
    }
    else{
        System.out.println("false");
    }
 }                                    //input is=123456;
                                            //x=9;
                                            //1=123;
                                            //2=456;
                                           //3+6=9;
                                           //return true;
}
