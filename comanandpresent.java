public class comanandpresent {
    public static void missing(int a[]){
        int f=0;
        for(int i=1;i<=6;i++){//thise is code of coman element and missing element
            f=0;
           for(int j=0;j<a.length;j++){
            if(a[j]==i){
                //System.out.println(i);
              f=1;
              break;
            }
           }
          if(f==0){
            System.out.println("missing element of=="+i);
          }
        }
    }
    public static void comanelement(int a[]){
    int f=0;
    for(int i=0;i<a.length;i++){
        f=0;
        for(int j=i+1;j<a.length;j++){
           if(a[i]==a[j]){
            System.out.println("it is a coman element=="+a[i]);
            f=1;
            break;
           }
        }         
}
}
public static void main(String[] args) {
    int a[]={1,2,3,4,3};
    comanelement(a);
  missing(a);    
}
}