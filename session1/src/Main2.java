import java.util.Scanner;


public class Main2 {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter second number");
		int b =sc.nextInt();
		boolean v=User.display(a,b);
		System.out.println(v);
		sc.close();
	}

}
