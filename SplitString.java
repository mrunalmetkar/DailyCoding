class SplitString
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        List<String> listOfStr=new ArrayList<>();
        
        StringBuffer alpha=new StringBuffer();
        StringBuffer num=new StringBuffer();		
        StringBuffer specChar=new StringBuffer();
        
        for(int i=0;i<S.length();i++)
        {
            if(Character.isAlphabetic(S.charAt(i)))         //charAt(i) will give character at ith position of STring ret type - char
            alpha.append(S.charAt(i));
            
            else if(Character.isDigit(S.charAt(i)))
            num.append(S.charAt(i));
            else
            specChar.append(S.charAt(i));
            
            
        }
        
    
    
        listOfStr.add(alpha.toString());   //converting StringBuffer to String using toString()
        
        listOfStr.add(num.toString());
        listOfStr.add(specChar.toString());

        

        return listOfStr;
    }
} 
