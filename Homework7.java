
package homework7;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
	/*Write a program that ask the user to enter a number ,
	then show the foloowing menu
	1-CM to Iche
	2-Inche to CM
	3-Feet to Meter
	4-Meter to Feet
	5-Dunm to Hectar
	6-Hectar to Dunm
	7-Cels to Feh
	8-Feh to Cels
*/
	  Scanner input = new Scanner(System.in);

        System.out.println("1- CM to Inch");
        System.out.println("2- Inch to CM");
        System.out.println("3- Feet to Meter");
        System.out.println("4- Meter to Feet");
        System.out.println("5- Dunum to Hectare");
        System.out.println("6- Hectare to Dunum");
        System.out.println("7- Celsius to Fahrenheit");
        System.out.println("8- Fahrenheit to Celsius");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(num / 2.54 + " Inch");
                break;

            case 2:
                System.out.println(num * 2.54 + " CM");
                break;

            case 3:
                System.out.println(num * 0.3048 + " Meter");
                break;

            case 4:
                System.out.println(num / 0.3048 + " Feet");
                break;

            case 5:
                System.out.println(num / 10 + " Hectare");
                break;

            case 6:
                System.out.println(num * 10 + " Dunum");
                break;

            case 7:
                System.out.println((num * 9 / 5) + 32 + " Fahrenheit");
                break;

            case 8:
                System.out.println((num - 32) * 5 / 9 + " Celsius");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }
}
     

