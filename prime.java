import java.util.Scanner;
class prime
{
 public static void main(String[] args)
 {
  int a,b=0,c=0;
  Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
    b=no/2;
    for(a=2;a<=b;a++)
    {
     if(no%a==0)
     {
      System.out.println("Number is not prime number");
      c=1;
      break;
     }
    }
    if(c==0)
    System.out.println("Number is prime number");
 }
}
