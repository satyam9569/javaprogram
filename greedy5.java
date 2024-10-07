public class greedy5{
    public static void main(String[] args) {
        int nuber=9,digit=3,sum=0,r=0,k=1; //user give the digit and nuber how digit sum equal to given nuber first return; 
        for(int i=1;i<digit;i++){        //nuber =9,digit=2->18,27,45 aur bhi hai but first return;
             k=k*10;
        }
        for(int i=k;i<=(k*10)-1;i++){
            int n=i;
            while(n!=0){
                 r=n%10;
                n=n/10;
                sum=sum+r;
            }
            if(sum==nuber){
         System.out.println(i);
         return;
            }
         sum=0;
         r=0;
         n=0;
        }
    }
    
}
