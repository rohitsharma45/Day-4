import java.util.Scanner;


public class Employee1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid");
		int empid=sc.nextInt();
		System.out.println("Enter emp name");
		String name=sc.next();
		System.out.println("Enter salary");
		float sal=sc.nextFloat();
		System.out.println("Enter grade");
		char grade=sc.next().charAt(0);
		System.out.println("Enter Phone number");
		long phone=sc.nextLong();
		System.out.println("The Employee details are "
				+ " "+empid+" "+"\n"+name+" "+"\n"+sal+" "+"\n"+grade+
				" "+"\n"+phone);
		sc.close();
	}
	
	
}
