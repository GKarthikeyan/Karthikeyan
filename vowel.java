import java.io.*;
import java.util.Scanner;
class vowel 
{
	public static void main (String[] args) 
  {
        char ch;
        Scanner scan = new Scanner(System.in);
        ch = scan.next().charAt(0);
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
        {
            System.out.print("Vowel");
        }
        else
        {
            System.out.print("consonant");
        }
    }
}
