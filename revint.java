import java.io.*;
import java.util.*;
class revint
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
String s=String.valueOf(n);
StringBuffer sb=new StringBuffer(s);
sb.reverse();
System.out.println(sb);
}
}
