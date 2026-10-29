
package homework11;

public class Homework11 {

    
    public static void main(String[] args) {
	/*
	2-Write a program that prints a revers triangle of n stars 
	n=5
	*****
	****
	***
	**
	*
	*/  
	
	int n=5;
	
	for (int i=n;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
