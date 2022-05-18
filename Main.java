import java.util.*;

//import StringMethod.StrMethods;

public class Main {

public static void main(String[] args)
{

		String s1="I am working for zoho";
		String a="zoho";
		StrMethods obj=new StrMethods(s1);
		System.out.println("String trimmed : "+obj.trim(s1));
		System.out.println("String substring : "+obj.substring(0, 4));
		System.out.println("String replaced : "+obj.Replace('a','y'));
		System.out.println("String indexof : "+obj.StrIndexOf('a'));

}

}
