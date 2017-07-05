import java.util.Arrays;
import java.util.Scanner;

public class least_no_delete 
	{
	    public static void main(String ar[])
	    {
	     Scanner sc=new Scanner(System.in);
	     String inp=sc.nextLine();
	     System.out.println("Enter the value of k:");
	     int no=sc.nextInt();
	     char ch[]=inp.toCharArray();
	     Arrays.sort(ch);
	     int f=ch.length-no;
	     for(int i=0;i<f;i++)
	    	 System.out.print(ch[i]);
	    	
	    }
	}

