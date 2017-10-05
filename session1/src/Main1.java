
public class Main1 {

	public static void main(String[] args) {
		
		Student s1=new Student(111,"Ram");
		Student s2=new Student(111,"Ram");
		boolean b=s1.equals(s2);
		System.out.println(b);
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());
	}
}
