import java.io.*;

class InvertedHalfPattern
{
public static void main (String args[])
{
int i,j;
int n=6;
for(i=1;i<=n;i++)
{
System.out.println(" ");
for(j=6;j>=i;j--)
{
System.out.print("* ");
}

}
System.out.println();
}
}