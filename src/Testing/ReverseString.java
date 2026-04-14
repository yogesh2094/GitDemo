package Testing;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Yogesh";
		String result="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			
			result+=c;
		}
		System.out.println("Reverse String is : " +result);
		
		
		StringBuffer sb=new StringBuffer("Mugdha");
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse String using StringBuffer is : " +rev);
	}

}
