
package homework2;
import java.util.Scanner;
public class Homework2 {

    public static void main(String[] args) {
	//2
	Scanner in = new Scanner(System.in);
	System.out.println("Please Enter the even number");
	int x1=in.nextInt();
	if(x1%2==0)
	    System.out.println("OK");
	else
	    System.out.println("This Number is Odd");
    }
    
}
