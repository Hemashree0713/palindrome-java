class stringpalindromecheck
{
	public static void main(String[] args)
	{
		String str1="MOM";
		StringBuffer s1=new StringBuffer(str1);
		StringBuffer s2=s1.reverse();
		if(str1.equalsIgnoreCase(s2.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
