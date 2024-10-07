public class shortingsarching18 {
    public static void main(String[] args) { //code of counting short
        int arr[]={1,2,9,0,8,2,8,9,14};    //first we find the max value in given array
        int n=arr.length;                  //and create new array of max size
        int max=arr[0];                    //and comapre the vlaue how many time present in array
       int f=0;                            //and last we new array value index replace
        for(int i=0;i<n;i++){              //and print the new array index 
         if(max<arr[i]){
            max=arr[i];
         }
        }
       // System.out.println(max);
       int t=1;
        int arr1[]=new int[max+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    arr1[arr[i]]=t;//new array me jo value match hue hai use me t ko dalna hai aur jitne baare aaya hai use increse karna hai
                    t++;
                }
            }
            t=1;
        }
       for(int i=0;i<arr1.length;i++){
        if(arr1[i]>0){
            for(int j=0;j<arr1[i];j++){
            System.out.println(i);
            }

            }
        }
        }
    }

