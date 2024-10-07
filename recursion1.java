public class recursion1 {//find the any elment power
    static int t=1;
    /*public static void power1(int base,int power){
       /* if(power==0){
            System.out.println(t);
            return;
        }
         t=t*base;
        power1(base,power-1);
    }*/
    //zig zag function 
    public static void power1(int n){
    if(n==0){
        return;
    }
    System.out.println("pre"+n);
    power1(n-1);
    System.out.println("in"+n);
    power1(n-1);
    System.out.println("post"+n);
    }
    public static void main(String[] args) {
        /*int base=5,power=3;
        power1(base,power)*/
        int n=2;
power1(n);
    }
}
