public class shortingsarching10 {
    public static void main(String[] args) {   //10,3,5,6,2
        int arr[]={10,3,5,6,2};                  //step1=3*5*6*2=180
        int n=arr.length;                        //step2=5*6*2*10=600;
        int res[]=new int[45];                   //step3=6*2*3*10=360
        int t=0;                                 //step4=2*10*3*5=300
                                                 //step5=10*3*5*6=900;
        for(int i=0;i<n;i++){                    //jise value se start kaere rhe hai use miss kare ke sab se multiplay karna hai
            res[t]=1;
            for(int j=0;j<n;j++){
                if(i==j){
                 System.out.print(""); 
                }
                else{
            res[t]=res[t]*arr[j];
                }
            }
            t++;
        }
        for(int i=0;i<t;i++){
            System.out.println(res[i]);
        }
    }
}
