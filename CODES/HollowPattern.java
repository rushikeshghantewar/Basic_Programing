import java.io.*;

class HollowPattern 
{
    public static void main(String args[]) 
    {
        int i, j;
        int n = 6;
        for (i = 1; i <= n; i++) 
        {
            for (j = 6; j >= i; j--) 
            {
                System.out.print(" ");
            }
            for (int k=1;k<(i*2);k++)
            {
                if(i!=6)
                {
                    if(k>1 && k<(i*2)-1)
                {
                    System.out.print(" ");
                }
            }
                else
                {
                    System.out.print("*");
                }
                
                
            }
            System.out.println();
        }
        
    }
}