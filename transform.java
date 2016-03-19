class transform
{
	public static void main(String[] args)
	{
		toBin(6);
		toOct(60);
		toHex(60);
	}
	public static void toBin(int num)
	{
		trans(num,1,1);
	}
	public static void toOct(int num)
	{
		trans(num,7,3);
	}
	public static void toHex(int num)
	{
		trans(num,15,4);
	}
	
	public static void trans(int num,int base,int offset)
	{
		if(num==0)
			System.out.println(0);
			return;
		//table
		char [] ch = new char[]{'0','1','2','3','4','5','6','7','8'
									,'9','A','B','C','D','E','F'};
		//position
		char [] arr = new char[32];
		//pointer
		int pos = arr.length;

		while (num!=0)
			{
				arr[--pos]=ch[num & base];
				num>>>=offset;
			}
		for (int x=pos;x<arr.length;x++)
			{
				System.out.print(arr[x]);
			}
				System.out.println();
	}

}