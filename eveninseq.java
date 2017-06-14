import java.util.Scanner;

public class eveninseq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int intial=sc.nextInt();
		sc.nextLine();
		int fin=sc.nextInt();
		for(int i=intial;i<fin;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
sc.close();
	}

}
