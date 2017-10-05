import java.util.Scanner;

enum GENDER{M,F;}

public class PersonMain {
	
	 public static void main(String[] args) {
	 Person p=new Person();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("First Name:");
		String firstName=sc.next();
		System.out.println("Last Name:");
		String lastName=sc.next();
		System.out.println("Gender:");
		char gender=sc.next().charAt(0);
		if(gender=='M' || gender=='F'){
			
			p.setFirstName(firstName);
			p.setLastName(lastName);
			
			if(gender=='M'){
				p.setGender(GENDER.M);
			}
			else{
				p.setGender(GENDER.F);
			}
				
		
		System.out.println(p.getFirstName()+"\n"+p.getLastName()+
				"\n"+p.getGender());
		}
		else
		{
			System.out.println("Not a valid gender");
		}
			
		sc.close();
	}
}

