
package homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
	//1
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter the 2 numbers");
	int x1=in.nextInt();
	int x2=in.nextInt();
	
	if(x1>x2)
	    System.out.printf("The max number is: %d" , x1);
		else
	    System.out.printf("The max number is: %d" , x2);
    }
    //2 
    
}
