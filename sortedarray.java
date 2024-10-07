public class sortedarray {
    public static void main(String[] args) {
        int a[]={2,1,4,0,6};
       // int min=arr[0];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
              if(a[i]>a[j]){//ascending order and decending order
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
            System.out.println(a[i]);
        
        }
    }

    }
