import java.util.*;
class factorial
{
 public static void main(String ar[])
 {
    Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int sum=1;
        for(int i=1;i<=s;i++)
        sum=sum*i;
        System.out.print(sum);
   }}
