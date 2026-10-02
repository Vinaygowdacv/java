import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int age;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your age");
	    age = sc.nextInt();
	    
	    if (age>=18){
	        System.out.println("You can vote "+age);
	        }
	    else{
	       System.out.println("You cannot vote");
	   }
	    
	    
		
	}
}
