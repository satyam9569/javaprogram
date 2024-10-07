import java.util.*;
public class count{
//class Name{}
//String str;
  public  static void display(){
     Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
     String st[]=new String[str.split("").length];
st=str.split("");

    int i;
    int count=0,integer=0,word=0;
    for(i=0;i<st.length;i++){
        if(st[i].compareTo(" ")==0){
        count++;
          }
    }
    System.out.println("space is a="+count);
    String st1[]=new String[str.split(" ").length];
st1=str.split(" ");
 for(i=0;i<st1.length;i++){
    if(st1[i].equals("0")||st1[i].equals("1")
    ||st1[i].equals("2")||st1[i].equals("3")||
    st1[i].equals("4")||st1[i].equals("5")||
    st1[i].equals("6")||st1[i].equals("7")||
    st1[i].equals("8")||st1[i].equals("9")){
        integer++;
    }
    else{
        word++;
    }
 }
 System.out.println("integer vale found the given string=="+integer);
  System.out.println("word found the given string=="+word);

  }
//}
    public static void main(String arg[]){
        //Name N1=new Name();
            display();
             //   show();
    }
}
