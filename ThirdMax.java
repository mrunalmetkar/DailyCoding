class Solution
{
    int thirdLargest(int arr[], int n)
    {
	    // Your code here
	    
	    int first_max=Integer.MIN_VALUE;
	    int sec_max=Integer.MIN_VALUE;
	    int third_max=Integer.MIN_VALUE;
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]>first_max)
	        {
	            third_max=sec_max;
	            sec_max=first_max;
	            first_max=arr[i];
	        }
	        else if(arr[i]>sec_max)
	        {
	            third_max=sec_max;
	            sec_max=arr[i];
	        }
	        else if(arr[i]>third_max)
	        {
	            third_max=arr[i];
	        }
	    }
	    
	    return third_max;
    }
}