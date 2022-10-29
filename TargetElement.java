//using the two pointer approach
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        Arrays.sort(arr);
        
        int right, left;
        
        left=0;
        right=arr.length-1;
        
        while(left<right)
        {
            if(arr[left]+arr[right]<x)
            left++;
            else if(arr[left]+arr[right]==x)
            return true;
            else
            right--;
        }
        
        return false;
        
    }
}