//package StringMethod;

public class StrMethods 

{
	private String org;
	public StrMethods(String org)
	{
	this.org=org;
}

	//String Trim
public  String trim(String s){
	String ans="";
	for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)!=' ')
	{
	ans+=s.charAt(i);
	}
	}
	return ans;

}

// String Substring return 
public String substring(int si,int ei)
{
	String ans="";
	for(int i=si;i<ei;i++)
	{
	ans+=org.charAt(i);
	}
	return ans;
}

//String Replace
public String Replace(char ch1, char ch2)
 {
    char[] arr = org.toCharArray();
    int len =org.length();
    for(int i=0;i<len;i++)
    {
    if(arr[i]==ch1){
    arr[i] = ch2;
    }
    }
    String str2 = new String(arr);
           return str2;
}

//String Index
public int StrIndexOf(char ch) 
{
		int len = org.length();
  		char[] arr =  org.toCharArray();
  		for(int index =0;index<len;index++)
  		{
  			if(ch== arr[index]){
  				return index;
  			}
  		}
  		return -1;
  	}
}
