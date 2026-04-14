package Testing;

public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Duplicate Characters in String
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
		
		//Duplicate Words in String
		
		String s1="Java Selenium API Java Python";
		
		String words[]=s1.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println("Duplicate Words in String : " +words[i]);
			}
		}
	}

}
