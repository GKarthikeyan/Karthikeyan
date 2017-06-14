import java.util.Scanner;

public class reversedigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String no=sc.nextLine();
		StringBuilder input1 = new StringBuilder();
        input1.append(no);
         input1 = input1.reverse();
         System.out.print(input1);
sc.close();
	}

}
