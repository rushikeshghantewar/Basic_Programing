import java.io.*;
import java.util.*;

class AssignmentSolution2 {
  public static void main(String args[]) {
    Scanner read=new Scanner(System.in);
    int row=read.nextInt();
    read.close();
    int i,j,k,o=1;

//--------------------Pyramid Pattern 1---------------

    for(i=1;i<=row;i++) {
	for(j=row;j>=i;j--) {
		System.out.print(" ");
     }
	for(k=1;k<=i;k++) {
		System.out.print(i+" ");
     }
    System.out.println("");
   }

//--------------------Pyramid Pattern 2---------------

    for(i=1;i<=row;i++) {
	   for(j=row;j>=i;j--) {
		System.out.print(" ");
     }
	   for(k=1;k<=i;k++) {
		System.out.print(k+" ");
     }
    System.out.println("");
   }

//-----------Pyramid Pattern 3 Full Pyramid-----------

    for(i=1;i<=row;i++) {
	for(j=row;j>=i;j--) {
	   System.out.print(" ");
	}
	for(k=1;k<=i;k++) {
	   System.out.print("* ");
	}
	System.out.println("");
    }

//--------------------Pyramid Pattern 4---------------
    for(i=1;i<=row;i++) {
	int n=0;
	
	for(j=row-1;j>=i;j--) //(k=i;k>=-(i-1);k--)
	{
	   System.out.print(" ");   
	}
	for(k=1;k<=o;k++) {
	   if(k<=i) {
		n=n+1;
		System.out.print(n);
	   }
	   else {
		n=n-1;
		System.out.print(n); //i-Math.abs(k);
	   }
	   
	}
	System.out.println();
	o+=2;
    }


//--------------------Pyramid Pattern 5---------------
    for(i=row;i>=1;i--) {	
	for(j=i-1;j>=1;j--) {
	   System.out.print(" ");   
	}
	for(k=i;k<=row;k++) {
	   System.out.print(k);
	}
	for(int l=row-1;l>=i;l--) {
	   System.out.print(l);
	}
	System.out.println();
	o+=2;
    }

//-----------Pyramid Pattern 6 Inverted Full----------


    for(i=1;i<=row;i++) {
	for(j=1;j<=i;j++) {
	   System.out.print(" ");
	}
	for(k=row;k>=i;k--) {
	   System.out.print("* ");
	}
	System.out.println("");
    }


//--------------------Pyramid Pattern 7---------------

     for(i=row;i>=1;i--) {
	for(j=row-1;j>=i;j--) {
		System.out.print(" ");
    }
	for(k=1;k<=i;k++) {
		System.out.print(i+" ");
    }
	System.out.println();
   }




//---------------------Half Pyramid-------------------

    for(i=1;i<=row-4;i++) {
	for(j=1;j<=i;j++) {
	   System.out.print("* ");
	}
	System.out.println();
    }


//----------------Inverted half Pyramid----------------

     for(i=1;i<=row-4;i++) {
	for(j=row-4;j>=i;j--) {
	   System.out.print("* ");
	}
	for(k=1;k<=i;k++) {
	   System.out.print(" ");
	}
	System.out.println("");
    }


//-------------Hollow Inverted Half Pyramid-----------

     for(i=1;i<=row-3;i++) {
	for(j=i;j<=row-3;j++) {
	   if(i==1 || j==i || j==row-3) {
	      System.out.print("* ");
	   }
	   else {
	      System.out.print("  ");
	   }
	}
	System.out.println();
     }


//------------------Hollow Full Pyramid---------------

    for(i=1;i<=row-3;i++) {
	for(j=i;j<=row-3;j++) {
	   System.out.print(" ");
	}
	for(k=1;k<i*2;k++) {
	   if(k==1 || k==i*2-1 || (i==row-3 && k%2==1)) {
	   	System.out.print("*");
	   }
	   else {
		System.out.print(" ");
	   }
	}
	System.out.println();
    }

 }
}