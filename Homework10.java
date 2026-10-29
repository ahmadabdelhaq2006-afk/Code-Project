
package homework10;

public class Homework10 {

    public static void main(String[] args) {
		/*
	2-Write a program that prints a triangle of n stars 
	n=5
	*
	**
	***
	****
	*****
	*/
      
int n=5;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}