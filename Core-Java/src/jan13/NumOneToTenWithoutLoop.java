package jan13;

public class NumOneToTenWithoutLoop 
{

	public static void main(String[] args) 
	{
		NumOneToTenWithoutLoop obj = new NumOneToTenWithoutLoop();

		obj.PrintNumber(1, 10);
	}
	
	public void PrintNumber(int i, int j)
	{
		if (i<=j)
		{
		System.out.println(i);
		
		PrintNumber(i+1, j);
		}
	}
}
