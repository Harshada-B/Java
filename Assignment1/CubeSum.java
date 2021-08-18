package Assignment1;

public class CubeSum 
{
	public static int cubeSum(int n)
	{
		int x=(n*(n+1)/2);
		return x*x;
	}
	public static void main(String args[])
	{
		int n=5;
		System.out.println(cubeSum(n));
	}
}
