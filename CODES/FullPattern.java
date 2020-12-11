import java.io.*;

class FullPattern {
    public static void main(String args[]) {
        int i, j, k;
        int n = 6;
        for (i = 1; i <= n; i++)
        {
            for (j = 12; j >= n; j--)
            {
                for (k = 1; k <= i; k++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}