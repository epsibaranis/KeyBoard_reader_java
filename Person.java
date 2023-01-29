package S2nos;

public class Person implements java.io.Serializable {
	private String name,address,emailId;
	private int age;
	public Person() {
		name="epsi";
		address="kosavapatti";
		emailId="epsi13@gmail.com";
		age=25;
	}
	public Person(String n1) {
		name=n1;
		address="nill";
		emailId="nill";
		age=0;
	}
	public Person(String n1,int a1) {
		name=n1;
		address="nill";
		emailId="nill";
		age=a1;
	}
	public Person(String n1,int a1,String a2) {
		name=n1;
		address=a2;
		emailId="nill";
		age=a1;
	}
	public Person(String n1,int a1,String a2,String e1) {
		name=n1;
		address=a2;
		emailId=e1;
		age=a1;
	}
	public void setName(String a1) {
		name=a1;
	}
	public void setAge(int a1) {
		age=a1;
	}
	public void setEmailId(String a1) {
		emailId=a1;
	}
	public void setAddress(String a1) {
		address=a1;
	}
	public void splitName(String a1) {
		a1.split("");
	}
	public void splitAddress(String a1) {
		a1.split("");
	}
	public void splitEmailId(String a1) {
		a1.split("");
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getName() {
		return name;
	}
	public void print() {
		System.out.println("Person name    :"+name);
		System.out.println("Person age     :"+age);
		System.out.println("Person Address :"+address);
		System.out.println("Person emailId :"+emailId);
	}
	
}
