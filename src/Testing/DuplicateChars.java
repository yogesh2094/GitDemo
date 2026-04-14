package Testing;

public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabcddtrgtg"; //adtg

		String result="";
		
		for(int i=0;i<s.length()-1;i++)
		{
			char c=s.charAt(i);
			
			for(int j=i+1;j<=s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					result+=c;
				}
			}
		}
		System.out.println("Duplicate Characters in String : " +result);
	}

}
