import java.io.*;

class HalfPattern
{
public static void main (String args[])
{
int i,j;
int n=6;
for(i=0;i<n;i++)
{
System.out.println(" ");
for(j=0;j<=i;j++)
{
System.out.print(" *");
}
}
System.out.println(" ");
}
}