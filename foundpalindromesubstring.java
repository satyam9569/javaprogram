public class foundpalindromesubstring {
    public static void main(String[] args) {
       String str1="satyam" ;
        String str2="st";        //output=sat
        int count=0,t=0,f=0;      //because (sat) ke beach me sabhi chareter hain
        for(int i=0;i<str2.length();i++){
            char ch1=str2.charAt(i);
            f=0;
            for(int j=t;j<str1.length();j++){   //code is substring in the present chareter given string
                char ch2=str1.charAt(j);
                if (ch1==ch2) {
                    f=1;
                    break;
                }
            }
            if (f==1) {
            for(int j=t;j<str1.length();j++){
            char ch2=str1.charAt(j);
            t++;
            if(ch1==ch2){
                count=1;
              System.out.print(ch1);
                break;
            }
            else if(count==1){
                System.out.print(ch2);
            }


            } 
        }
        else{
            System.out.println();
            System.out.println("value is not prsent== "+ch1);
        }
         
        }

    }
    }

