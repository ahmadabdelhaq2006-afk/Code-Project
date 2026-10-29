
package homework12;
public class Homework12 {
    public static void main(String[] args) {
	/*
	2-Write a program that prints a pyramid of n stars 
	
	 * 
	***
       *****
      *******	
	*/
	

        int n=4;

        for (int i=1;i<=n;i++) {

            for (int j=1; j<=n-i;j++) {
                System.out.print(" ");
            }

            for (int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}