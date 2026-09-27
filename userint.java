package firsttime;
import java.util.Scanner;
public class userint {
	public static void main(String[]args) {
		Scanner sc = new
				Scanner(System.in);
		System.out.println("Enter Your name ");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("Your Name is :"+name);
		System.out.println("Your Name is :"+age);
		
		sc.close();
		
		
	}
}
// class man{
// 	void dog() {
// 	System.out.println("This is Parent class ");
// }
// }
// class man_ extends man{
// 	void man1() {
// 	System.out.println("This is child class ");
// }
// }
// public class userint{
// 	public static void main(String[]args) {
// 		man_ d =new man_();
// 		d.dog();
// 		d.man1();
		
		
		
// 	}
// }
