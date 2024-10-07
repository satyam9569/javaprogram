public class palendromestring1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       String str1=new String[str.split("").length];
       str1=str.split("");
       int l=0;
       int h=str1.length-1;
       while(l<h){
        char temp=str1[l];
        str1[l]=str1[h];
        str1[h]=temp;
        l++;
        h--;
       } 
       
    }
}
