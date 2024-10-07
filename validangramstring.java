import java.util.*;
public class validangramstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str1=sc.nextLine(); 
        String str2=sc.nextLine();
    
        String newstr1[]=new String[str1.split("").length];//thise line is converd the string to array
        newstr1=str1.split("");
       String newstr2[]=new String[str2.split("").length];//thise line is converd the string to array
        newstr2=str2.split("");
         for(int i=0;i<newstr1.length;i++){
            for(int j=i+1;j<newstr1.length;j++){
              if(newstr1[i].compareTo(newstr1[j])>0){//sorted string1
                String temp=newstr1[i];
                newstr1[i]=newstr1[j];
                newstr1[j]=temp;
}
            }
        }
            //System.out.println(newstr1[i]);
            StringBuilder reversedStr1 = new StringBuilder();
            for (String s : newstr1) {
                reversedStr1.append(s);                      //thise line converd the array to string1
            }
           String  sortedString1 = reversedStr1.toString();
           for(int i=0;i<newstr1.length;i++){   //sorted second string2
            for(int j=i+1;j<newstr1.length;j++){
              if(newstr2[i].compareTo(newstr2[j])>0){
                String temp=newstr2[i];
                newstr2[i]=newstr2[j];
                newstr2[j]=temp;
}
            }
        }
        StringBuilder reversedStr2 = new StringBuilder();
        for (String s : newstr2) {
            reversedStr2.append(s);                      //thise line converd the array to string2
        }
       String  sortedString2 = reversedStr2.toString();
       if(sortedString1.equals(sortedString2)){              //thise line first sorted string and second sorted string when equal result true
        System.out.println("valid angram string:thanks");
       }
       else{
        System.out.println("not valid :thanks");
       }
       System.out.print(sortedString1); //it is first sorted string
       System.out.println();
       System.out.print(sortedString2);//it is second sorted string
    }
}