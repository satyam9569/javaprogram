 import java.util.*;
 class student{
   // private
    String name;
    int age;
}
class tringle extends student{
//     public void printinfo(){
//System.out.println(age);
int b; 
}
class tr extends tringle{
 String str;
 }
 class f4 extends tr{
public void printinfo(int age,int b){
System.out.println(age);
System.out.println(b);
}
void show(String str){
System.out.println(str);
}

 }
public class class1{
    public static void main(String arg[]){
        f4 s1=new f4();
        //s1.name="satyam";
        Scanner sc=new Scanner(System.in);
        
        int age=sc.nextInt();
        int b=sc.nextInt();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        s1.printinfo(age,b);
        s1.show(str);
    }
}