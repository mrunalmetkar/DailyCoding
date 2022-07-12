/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseArray{
    public int[] reverseArray(int arr[], int arraySize){
        int left=0;
        int right= arraySize-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            
        }
        return arr;
        
    }
    
}
class GFG 
{
	public static void main (String[] args) 
	{
		//code
		
		Scanner sc=new Scanner(System.in);
	    int testCases =	sc.nextInt();
	    
	    ReverseArray rev=new ReverseArray();

	    while(testCases-->0)
	    {
	        int arraySize=sc.nextInt();
	        int arr[]=new int[arraySize];
	        
	        for(int i=0;i<arraySize;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        
	        int revArr[]=rev.reverseArray(arr, arraySize);
	         for(int i=0;i<arraySize;i++)
	        {
	            System.out.print(revArr[i]+" ");
	        }
	        
	        System.out.println();
	         
	    }
	}
}