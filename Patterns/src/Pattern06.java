import java.util.Scanner;
public class Pattern06
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;++i)
		{
			for(int j = n-i-1;j>0;--j)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;++j)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}