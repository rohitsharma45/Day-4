import java.util.Scanner;


public class Modulo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter second number");
		int b =sc.nextInt();
		boolean result;
		if(a%10 == b%10)
		{
			result=true;
		}
		else{
				result=false;
		}
		System.out.println(result);
		sc.close();
	}

}
