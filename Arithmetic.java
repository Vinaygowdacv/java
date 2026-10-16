package arithmetic;
import java.util.Scanner;

public class Arithmetic {
	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = sc.nextInt();
		System.out.println("Enter the second Number");
		int b = sc.nextInt();
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		System.out.println("sum is "+sum);
		System.out.println("sub is "+sub);
		System.out.println("mul is "+mul);
		System.out.println("div is "+div);
		
	}
	

}
