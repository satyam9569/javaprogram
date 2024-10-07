import java.util.Scanner;
//public class validangramstring1{
public class validangramstring1 {
   public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    String str1=sc.nextLine(); 
    String str2=sc.nextLine(); 

    String newstr1[]=new String[str1.split("").length];
    newstr1=str1.split("");
    String newstr2[]=new String[str2.split("").length];
    newstr2=str2.split("");
    for(int i=0;i<newstr1.length;i++){
        for(int j=i+1;j<newstr1.length;j++){
          if(newstr1[i].compareTo(newstr1[j])>0){//ascending order in first string
            String temp=newstr1[i];
            newstr1[i]=newstr1[j];
            newstr1[j]=temp;
          }
}
System.out.println(newstr1[i]);//print the sorted string1 array
}
StringBuilder reversedStr1 = new StringBuilder();
for (String s : newstr1) {
    reversedStr1.append(s);                      //thise line converd the array to string1
}
String  sortedString1 = reversedStr1.toString();
System.out.println(sortedString1);//print the sorted string1
for(int i=0;i<newstr2.length;i++){
  for(int j=i+1;j<newstr2.length;j++){                                                              //tise code is a two string dono ko short karne per
                                                                                                    //equal aate hai to valid
    if(newstr2[i].compareTo(newstr2[j])>0){//ascending order in second string
      String temp=newstr2[i];
      newstr2[i]=newstr2[j];
      newstr2[j]=temp;
    }
}
System.out.println(newstr2[i]);//print the sorted string2 arry
}
StringBuilder reversedStr2= new StringBuilder();
for (String s : newstr2) {
reversedStr2.append(s);                      //thise line converd the array to string2
}
String  sortedString2 = reversedStr2.toString();
System.out.println(sortedString2);//print the sorted string2
if (sortedString1.equals(sortedString2)) {
  System.out.println("valid angram");
}
else{
  System.out.println("not valid");
}
}
}