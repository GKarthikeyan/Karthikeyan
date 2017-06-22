import java.util.Arrays;
import java.util.Scanner;

public class Logic1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
	
		int input[]=new int [10];
		for(int i=0;i<10;i++)
		
			input[i]=sc.nextInt();
		
		Arrays.sort(input);
		int no=input[10-1];
		for(int i=0;i<10;i++)
		{
			if(input[i]==no)
				count++;
		}
		System.out.print(count);
	}

}
