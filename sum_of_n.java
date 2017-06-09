class sum_of_n
{
 public static void main(String arg[])
 {
  int sum=0;
  int in=Integer.parseInt(arg[0]);
  for(int i=0;i<=in;i++)
  sum=sum+i;
  
  System.out.println(sum);
 }
}
