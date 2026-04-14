package Testing;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="madam";
		String result="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			
			result+=c;
		}
		if(result.equals(s))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}

	}

}
