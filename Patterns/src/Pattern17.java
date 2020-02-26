import java.util.*;
public class Pattern17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int N = n;
		n-=2;
		for(int i=0;i<N-1;++i)
		{
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		for(int i=1;i<=n;++i)
		{
			for(int j =n-i+1;j>=1;--j)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1;j<=2*i-1;++j)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			System.out.println();
		}
		for(int i=0;i<2*N-1;++i)
		{
			System.out.print("*");
		}
	}
}
