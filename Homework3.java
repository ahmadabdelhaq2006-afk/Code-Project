
package homework3;
import java.util.Scanner;
public class Homework3 {

    public static void main(String[] args) {
	//3
	Scanner in=new Scanner(System.in);
	System.out.println("Please Enter the number");
	int x=in.nextInt();
	if(x%2==0)
	    System.out.println(x*2);
	else
	    System.out.println(x*x);
	
    }
    
}
