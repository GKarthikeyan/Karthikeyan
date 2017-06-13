import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		int pal=0;
		Scanner sc=new Scanner(System.in);
		String no=sc.nextLine();
		char ch[]=no.toCharArray();
		StringBuilder input1 = new StringBuilder();
        input1.append(no);
         input1 = input1.reverse();

        for (int i=0; i<input1.length(); i++)
        {
	    if(input1.charAt(i)==ch[i])
	    	pal++;
        }
        if(pal==input1.length())
        	System.out.print("the number is palindrom");
      else 
		System.out.print("the number is not palindrom");
sc.close();
	}

}
