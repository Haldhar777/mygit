
import java.util.*;
public class Hello{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World");
		System.out.println("Please enter a number");
		int n = sc.nextInt();
		System.out.println("The number is " + n);
		sc.close();
	}
}