 // import java.util.Scanner;
  public class count1{
    public static void main(String arg[]){
        String test=" satyam is 1234 : ";
        char[] ch=test.toCharArray();
        int intg=0;
        int space=0;
        int letter=0;
          int other=0;
          for(int i=0;i<test.length();i++){      
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isDigit(ch[i])){
                //System.out.println(ch[i]);
                intg++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            else{
            other++;
            }
          }
          System.out.println(letter);
          System.out.println(intg);
          System.out.println(space);
          System.out.println(other);
          

    }
}