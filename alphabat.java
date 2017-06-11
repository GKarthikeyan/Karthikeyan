import java.util.*;
class alphabat
{
 public static void main(System ar[])
 {
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  char c[]=s.toCharArray();
  boolean r=Character.isLetter(c[0]); 
  if(r==true)
  System.out.print("Character is an alphabat");
  else
  System.out.print("Character is not an alphabat");
 }
 }
