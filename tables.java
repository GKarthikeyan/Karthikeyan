import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int sum=1;
        for(int i=0;i<=10;i++)
        {
        	
        sum=i*s;
        System.out.println(i+""+"*"+s+"="+sum);
        	
        }
		sc.close();

	}

}
