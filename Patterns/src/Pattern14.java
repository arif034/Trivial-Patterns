import java.util.*;
public class Pattern14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("*");
			for(int i=1;i<=n;++i)
			{
				System.out.print("*");
				for(int j=1;j<=i-1;++j)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			System.out.println();
			}
			for(int i=0;i<=n;++i)
			System.out.print("*");
	}
}