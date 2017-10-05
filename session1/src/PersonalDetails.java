import java.util.Scanner;


public class PersonalDetails {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("__________________");
		System.out.println("First Name:");
		String firstname=sc.next();
		System.out.println("Last Name:");
		String lastname=sc.next();
		System.out.println("Gender:");
		char gender=sc.next().charAt(0);
		System.out.println("Age:");
		int age=sc.nextInt();
		System.out.println("Weight:");
		float weight=sc.nextFloat();
		System.out.println("The personal details are: "
				+ " "+"\n"+firstname+" "+"\n"+lastname+" "+"\n"+gender+
				" "+"\n"+age+" "+"\n"+weight);
		sc.close();
	}

}
