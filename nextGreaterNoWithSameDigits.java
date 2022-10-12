//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    int res = ob.findNext(n);
                    if(res==-1)
                        System.out.println("not possible");
                    else
                        System.out.println(res);
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int findNext (int n) 
    {
        // your code here
      
        //1. convert n to char array
        
        char[] arr=String.valueOf(n).toCharArray();
        
        //2. Find the smallest digit from end of char array
        
        int length=arr.length;
        int i=0;
        char smallestele='a';
        int index1=0;
        int index2=0;
        for(i=length-1;i>=0;i--){
            if(arr[i]>arr[i-1]){
                smallestele=arr[i-1];
                break;
            }
        }
        
       
        //System.out.println(index1);

        //3. Find the min element from the smallest element found
            //Traverse from the smallest ele's next index
        int minindex=0;
        int min=arr[i];
        for(int j=i;j<length;j++){
            if(arr[j]<min ) 
                min=arr[j];
                minindex=j;
                
        }
        //System.out.println(minindex);

        //4. swap the above minimum digit with earlier smallestele
        
        //swap(arr,i-1,minindex);
    
        char temp = arr[i-1];
        arr[i-1] = arr[minindex];
        arr[minindex] = temp;
    
        //5. Sort the array from smallest index to last
        Arrays.sort(arr,i,length-1);
        
        //6. return the final output
         if(i==0){
            return -1;
        }
        else
        {
            int result=Integer.parseInt(String.valueOf(arr));
            return result;
        }
    }

}