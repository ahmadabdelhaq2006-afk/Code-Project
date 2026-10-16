
package homework6;

import java.util.Scanner;

public class Homework6 {

 public static void main(String[] args) {
	//6
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the n numbers");
	int n=in.nextInt();
	for(int i=2;i<=n;i++)
	{
	    boolean prime = true;
	    for(int j=2;j<i;i++){
		if(i%j==0)
		prime=false;
		if(prime)
		    System.out.println(i);
	    }
	}
 }
}
