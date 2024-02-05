package assignments;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] str)
	{
		
		if(str==null || str.length==0)
		{
			return "";
		}
		
		String fir=str[0];
		for(int i=1;i<str.length;i++)
		{
			String current=str[i];
			int j=0;
			
			while(j<current.length() && j<fir.length() && current.charAt(j)==fir.charAt(j))
			{
				j++;
			}
			
			if(j==0)
				return "";
			
			fir=current.substring(0, j);
		}
		return fir;
			

	}
	
	
	public static void main(String[] args)
	{
		String[] str= {"flower","flow","flight","flex"};
		String commonPrefix=longestCommonPrefix(str);
		System.out.println("longest common prefix :"+commonPrefix);

	}
	
	
}

