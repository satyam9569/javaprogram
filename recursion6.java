
public class recursion6 {  //word break problem
   static int l=0;
   public static void show(String str1, int n,String str[]) {
     // String s = " ";
      if (n >= str1.length()) {
         return;
      }
      for (int i = n; i < str1.length(); i++) {
         String s = "";
         for (int j = n; j <= i; j++) {
            s = s + Character.toString(str1.charAt(j));
         }
         for(int k=l;k<str.length;k++){
         if (s.compareTo(str[k]) == 0) {
            System.out.print(s+" ");
            l=l+1;
         }
      }
     // System.out.println(s);
      }
      show(str1, n + 1,str);
   }

   public static void main(String[] args) {
      String str []= {"i" ,"like", "sam" ,"sung","samsung","mobile","ice","and","crem","man","go","icecream","mango"};
      String str1 = "ilikeicecreammandgomango";
      int n = 0;
      show(str1, n,str);
   } 
}
