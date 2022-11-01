

public class Main
{
    
    public static void reverseString(String str, int index, int length){
        String reversedString=null;
	   if(length==index){
	       return;
	   }
	   char temp=str.charAt(index);
	   reverseString(str, index+1, length);
	  
	   reversedString=""+temp;
       System.out.print(reversedString);
	}
	    
	public static void main(String[] args) {
	
	    String s="Reverse string using Recursion";
	    int index=0;
	    int length=s.length();
	   
	    reverseString(s,index,length);
	    
	    
    }
}
