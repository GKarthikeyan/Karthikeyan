import java.util.Scanner;

public class First_no_repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int no[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			no[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(no[0]==no[i+1])
				c=1;
		}
		if(c==1)
			System.out.print("element is repeated");
		else 
			System.out.print("element is not repeated");
	}

}
