public class practicearray {
    public static void main(String[] args) {
        int f=0;
        int a[]={1,2,3,4,5};
        int b[]={1,5};
        for(int i=0;i<b.length;i++){
            f=0;
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){
                    f=1;
                }
            }
            if(f==0){
                System.out.println("false");
                return;
            }
        }
        if(f==1){
            System.out.println("true");
        }
    }
}
