 import java.util.*;
public class slidingw{
    public int maxsolid(int a[],int k){
        int n=a.length;
        int ans[]=new int[n-k+1];
            int z=0;
            Stack<Integer>st=new Stack<>();
            int nge[]=new int[n];
            st.push(n-1);
            nge[n-1]=n;
            for(int i=n-2;i>=0;i--){
                while(st.size()>0&&a[i]>a[st.peek()])st.pop();
                if(st.size()==0)nge[i]=n;
                else nge[i]=st.peek();
                st.push(i);
            }
            int j=0;
        for(int j=0;j<n-k+1;j++){
            i
return ans;
    }
    //return ans;
    public static void main(String arg[]){
        int a[]={1,3,-1,-3,5,3,6,7};
        int t= maxsolid(a,3); 
        System.out.println(t);             
    }
}

