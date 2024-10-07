public class marge{
    public static void qunqure(int arr[],int start,int mid,int end){
       int marged[]=new int[end-start+1];
       int idx1=start;
       int idx2=mid+1;
       int x=0;
       while(idx1 <=mid && idx2<=end){
          if(arr[idx1]<=arr[idx2]){
            marged[x]=arr[idx1];
            x++;
            idx1++;
          
          }
          else{
            marged[x++]=arr[idx2++];
          }
       }
       while(idx1<=mid){
        marged[x++]=arr[idx1++];
       }
       while(idx2<=end){
        int i,j;
        marged[x++]=arr[idx2++];
        for(i=0,j=start;i<marged.length;i++,j++){
            arr[j]=marged[i];
            for( i=0;i<=4;i++){
            System.out.println(arr[i]);
            }
        }
       }
    }

       public static void divad(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divad(arr,start,end);
        divad(arr,mid+1,end);
       qunqure(arr,start,mid,end); 
       }
       public static void main(String arg[]){
        int arr[]={9,4,1,4,6,6,5};
        int n=arr.length;
        divad(arr,0,n-1);
       }
    }    