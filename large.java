import java.util.*;
class large
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        if((s1>s2)&&(s1>s3))
        System.out.print("Largest number is:"+s1);
        else if((s2>s1)&&(s2>s3))
        System.out.print("Largest number is:"+s2);
        else
        System.out.print("Largest number is:"+s3);
    }
}
