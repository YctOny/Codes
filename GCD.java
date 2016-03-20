class GcdTest
{
	public static void main(String[] args)
	{
		gcd(28,90);
	}
	
	public static void gcd(int a,int b)
	{
		int r;
		do
		{
			r = a % b;
			if(r != 0)
			{
				a = b;
				b = r;
			}
		}while(r != 0);
		Stdout.println(b);
	}
}