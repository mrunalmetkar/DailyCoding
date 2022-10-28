//Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        
        //1. convert string to char array
        char[] str1=a.toCharArray();
        char[] str2=b.toCharArray();
        
        
        //2. Initialize two arrays to keep counts of string chars via ascii's
        int arr_count=256;
        int arr1[]=new int[arr_count];
        int arr2[]=new int[arr_count];
        Arrays.fill(arr1,0);
        Arrays.fill(arr2,0);


        //3. Increment the ascii index of characters in string in both arrays
        for(int i=0;i<str1.length && i<str2.length;i++){
            arr1[str1[i]]++;       
            arr2[str2[i]]++;
        }
        
        //4. Compare frequencies of both arrays 
        for(int j=0;j<arr_count;j++){
            if(arr1[j]!=arr2[j])
            return false;
        } 
       
		
        
         //5. Check lengths of both strings
        if(str1.length!=str2.length)
            return false;
            
        return true;
    }
}