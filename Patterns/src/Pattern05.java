import java.util.*;
public class Pattern05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int j; 
		int n = sc.nextInt();
		for(int i=0;i<n;++i)
		{
			for(j = 0;j<i;++j)
			{
				System.out.print(" ");
			}
			for(j=n;j>=i+1;--j)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}