import java.util.*;
public class repeat {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n+1];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	int f=0;
	Arrays.sort(a);
	for(int i=0;i<n;i++)
	{
		if(a[i]==a[i+1])
		{
			f=1;
			System.out.println(a[i]);
		}
		
	}
		if(f!=1)
		System.out.println("No repeat numbers");
}
}
