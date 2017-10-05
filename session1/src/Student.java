
public class Student {
	
	private int rollno;
	private String studname;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		result = prime * result
				+ ((studname == null) ? 0 : studname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollno != other.rollno)
			return false;
		if (studname == null) {
			if (other.studname != null)
				return false;
		} else if (!studname.equals(other.studname))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + "]";
	}

	public Student(int rollno, String studname) {
		super();
		this.rollno = rollno;
		this.studname = studname;
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}

}
