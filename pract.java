class pract{
    static int t=0;
    public static int show(int a){
        if(a==2){
            return 1;
        }
    a=(show(a+1));
    System.out.println(a);
       return 0;
    }
    public static void main(String[] args) {
        int a=1;
        show(a);
    }
}