import java.io.*;
import java.util.*;
class primecount
{
public static void main(String args[])
{
  int count=0,j;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
for(int i=n+1;i<m;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
break;
}
if(i==j)
  count++;
}
System.out.print(count);
}}
