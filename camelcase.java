import java.io.*;
import java.util.*;
class camelcase
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String ss[]=s.split(" ");
for(int i=0;i<ss.length;i++)
{
String s1=ss[i];
String s2=String.valueOf(s1.charAt(0)).toUpperCase();
System.out.print(s2+s1.substring(1)+" ");
}
}
}
