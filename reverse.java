import java.util.*;
class reverse
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strArr=s.split("");
        for(int i=strArr.length-1;i>=0;i--)
        System.out.print(s.charAt(i));
    }
}
