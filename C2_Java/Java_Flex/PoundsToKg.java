package C2_Java.Java_Flex;// Convert Feet PoundsToKg.java
import java.util.Scanner;

public class PoundsToKg { 						
	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number in pounds: ");
	double pounds = input.nextDouble();

	double kilogram = pounds * 0.454;

	   System.out.printf("%f pounds is %f kilograms", pounds, kilogram);
	}


}