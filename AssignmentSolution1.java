import java.io.*;
import java.util.*;

class AssignmentSolution1 {
  public static void main(String args[]) {
//----------------problem 1--------------
    /*System.out.println("Hello");
    System.out.println("Rushikesh Ghantewar");*/
//----------------problem 2 to 4---------
    /*int c=74+36;
    System.out.println("74+36="+c);*/
    /*int r=50/3;
    System.out.println("50/3="+r);*/
    /*int r=0;
    r=-5+8*6;
    System.out.println(r);
    r=(55+90)%9;
    System.out.println(r);
    r=20+(-3)*5/8;
    System.out.println(r);
    r=5+15/3*2-8%3;
    System.out.println(r);*/
    
//----------------problem 5 to 7--------------

    //Scanner read=new Scanner(System.in);
    //int n=read.nextInt();int m=read.nextInt();


    /*int r=c*m;
    System.out.println(n+"/"+m+"="+r)*/
    /*int c=0;
    read.nextLine();
    read.close();
    char calculate=read.next().charAt(0);
    switch (calculate)
    {
	case 'c' :
	  c=n+m;
	  System.out.println(n+"+"+m+"="+c);
	  //c=0;
	  c=n-m;
	  System.out.println(n+"-"+m+"="+c);
	  //c=0;
	  c=n*m;
	  System.out.println(n+"*"+m+"="+c);
	  //c=0;
	  c=n/m;
	  System.out.println(n+"/"+m+"="+c);
	  //c=0;
	  c=n%m;
	  System.out.println(n+"mod"+m+"="+c);
		break;
	default :
	  c=n+m;
	  System.out.println(n+"+"+m+"="+c);
	  //c=0;
	  c=n-m;
	  System.out.println(n+"-"+m+"="+c);
	  //c=0;
	  c=n*m;
	  System.out.println(n+"*"+m+"="+c);
	  //c=0;
	  c=n/m;
	  System.out.println(n+"/"+m+"="+c);
	  //c=0;
	  c=n%m;
	  System.out.println(n+"mod"+m+"="+c);
    }*/
    /*int t,i;
    int number=read.nextInt();
    for(i=1;i<11;i++) {
    t=number*i;
    System.out.println(number+"x"+i+"="+t);
    }*/

//----------------problem 8 pattern--------------
/*   System.out.println("   J    a   v     v  a ");
   System.out.println("   J   a a   v   v  a a");
   System.out.println("J  J  aaaaa   V V  aaaaa");
   System.out.println(" JJ  a     a   V  a     a");*/

//----------------problem 9--------------

   /*double r=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
   System.out.println(r);*/

//----------------problem 10--------------

   /*double r=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
   System.out.println(r);*/

//----------------problem 11--------------

    /*float radius=7.5;
    double perimeter=0,area=0;
    perimeter=2*3.14*radius;
    area=3.14*radius*radius;
    System.out.println("perimeter is"+perimeter);
    System.out.println("area is"+area);*/

//----------------problem 12--------------

    /*Scanner read=new Scanner(System.in);
    int n=read.nextInt();
    int m=read.nextInt();
    int l=read.nextInt();
    int avg=(n+m+l)/3;
    System.out.println(avg);*/

//----------------problem 13--------------

    /*float width=5.5f, height=8.5f;
    float area=width*height;
    float perimeter= 2*(width+height);
    System.out.println("area is"+width+"*"+height+"="+area);
    System.out.println("perimeter is 2*("+width+"+"+height+")="+perimeter);*/

//----------------problem 14--------------

        /*System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");*/

//----------------problem 15--------------

    /*int a=5,b=4;
    System.out.println("a="+a+",b="+b);
    a=5+4;
    b=a-b;
    a=a-b;
    System.out.println("a="+a+",b="+b);*/

//----------------problem 16--------------

    /*System.out.println(" +\"\"\"\"\"+ ");
    System.out.println("[| o o |]");
    System.out.println(" |  ^  | ");
    System.out.println(" | '-' | ");
    System.out.println(" +-----+ ");*/

//----------------problem 17--------------

   /* Scanner read=new Scanner(System.in);
    int b=read.nextInt();
    int bin=read.nextInt();
    read.close();
    int i=0,carry=0;
    int sum[]=new int[b];
    read.close();
    while(b!=0 || bin!=0) {
	sum[i++]=(b%10+bin%10+carry)%2;
	carry=(b%10+bin%10+carry)/2;
	b=b/10;
	bin=bin/10;
    }
    if(carry !=0) {
	sum[i++]=carry;
    }
    --i;
    while(i>=0) {
	System.out.print(sum[i--]);
    }*/

//----------------problem 18--------------

    /*Scanner read = new Scanner(System.in);
    String prod=""; //for binary
    System.out.println("Enter First Binary Number = ");
    String n1= read.nextLine();
    read.close();
    System.out.println("Enter Second Binary Number = ");
    String n2= read.nextLine();
    int decimal1=Integer.parseInt(n1,2);
    int decimal2=Integer.parseInt(n2,2);
    int product=decimal1*decimal2;
    while(product>0)
	{
	  int r=product%2;
	  product=product/2;
	  prod=r+prod;
	}
    System.out.println("Product of Two Binary Number Is = "+prod);*/

//----------------problem 19 to 21--------------

    /*Scanner read = new Scanner(System.in);
    System.out.println("Input Data:");
    System.out.print("Input a decimal number: ");
    int decimal=read.nextInt();*/
    read.close();

    // Decimal Convert to binary

    /*String binary=Integer.toBinaryString(decimal);
    System.out.println("Expected Output:");
    System.out.println("Binary number is: "+binary);/*

    // Decimal Convert to Hexadecimal

    /*String hexDecimal=Integer.toHexString(decimal);
    System.out.println("Expected Output:");
    System.out.println("HexaDecimal number is: "+hexDecimal);/*

    // Decimal Convert to Octal

    /*String octal=Integer.toOctalString(decimal);
    System.out.println("Expected Output:");
    System.out.println("Octal number is: "+octal);*/

//----------------problem 22 to 24--------------

    Scanner read= new Scanner(System.in);
    System.out.println("Input Data:");
    System.out.print("Input a bianary number: ");
    String binary=read.nextLine();
    read.close();

    // Binary Convert to Decimal

    int decimal=Integer.parseInt(binary,2);
    System.out.println("Expected Output:");
    System.out.println("Decimal number is: "+decimal);

    // Binary Convert to HexaDecimal

    String hexDecimal=Integer.toHexString(decimal);
    System.out.println("Expected Output:");
    System.out.println("HexaDecimal number is: "+hexDecimal);

    // Binary Convert to Octal

    String octal=Integer.toOctalString(decimal);
    System.out.println("Expected Output:");
    System.out.println("Octal number is: "+octal);*/

//----------------problem 25--------------"

    /*Scanner read= new Scanner(System.in);
    System.out.println("Input Data:");
    System.out.println("Input a octal number: ");
    String octal=read.nextLine();

    // Octal Convert to Decimal
    try {
    int decimal=Integer.parseInt(octal, 8);
    System.out.println("Expected Output:");
    System.out.println("Decimal number is: "+decimal);
    }
    catch(Exception NumberFormatException) {
    System.out.println("we can not put number 8 & 9 at unit place in octal");
    }*/


  }
}













