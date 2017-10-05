class Person {
	

	private String firstName;
	private String lastName;
	//private char gender;
	private GENDER gender;
	
	/*public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}*/
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public GENDER getGender() {
		return gender;
	}
	public void setGender(GENDER gender) {
		this.gender = gender;
	}
	
	
	/*public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}*/
	

	
}
