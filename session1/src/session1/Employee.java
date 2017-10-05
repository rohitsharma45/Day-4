package  session1;
public class Employee{
	int empNo;
	String empName;
	static String compname="Capgemini";
	Employee(int e, String n)
	{
		empNo=e;
		empName=n;
	}
	void display()
	{
		//empNo=r;
		//empName=n;
		System.out.println(empNo+"    "+empName+" "+compname);   
	}
	public static void main(String[] args) {
		//Employee.display(111,"abc");
		//Employee.display(222,"bbc");
		Employee e1=new Employee(111,"abc");
		Employee e2=new Employee(222,"bbc");
		e1.display();
		e2.display();
		
	}
}	