public class recursion {
    static int fact=1;
    public static int printiincress(int n){
        if(n==1){
            System.out.println("factorial is a->"+fact);//code of factorial;
            return 1;
            
        }
        fact=fact*n;
        printiincress(n-1);
        return 1;
       /* System.out.println(n);//print dicresing order
        printiincress(n-1);
        System.out.println(n);//incress order*/
        
    }
    public static void main(String[] args) {
       int n=4;
    printiincress(n);
    }
}
