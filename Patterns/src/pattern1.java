import java.util.*;
public class pattern1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int j;
		int count = 0; 
		int n = sc.nextInt();
		for(int i=0;i<n;++i)
		{
			for(j = n-i-1;j>0;--j)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i+1;++j)
			{
				System.out.print(++count + " ");
			}
			System.out.println();
		}
	}
}