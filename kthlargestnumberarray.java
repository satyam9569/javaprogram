public class kthlargestnumberarray {
    static class A{
    public  void largest(int a[],int val){
        int max=a[0];
        for(int i=0;i<val;i++){
          if(max<=a[i]){
            max=a[i];
          }
        }
        System.out.println(max);
      }
}
   public static void main(String arg[]){
    A s1=new A();
    int a[]={2,3,5,6,8};
    int va=3;
s1.largest(a,3);
   } 
}
