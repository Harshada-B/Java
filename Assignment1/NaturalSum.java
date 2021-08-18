package Assignment1;

public class NaturalSum {
	public static void main(String args[])
	{
		int n=100;
		Sum(n);
	}
	static void Sum(int i)
	{
		for(int no=1;no<i;no++)
		{
			if(no%3==0 && no%5==0)
				System.out.println(no +" ");
		}
	}

}
