package S2nos;
public class Biodata {

	public static void main(String[] args) {
		KBReader1 name,age,salary,designation,emailID,address;
		System.out.print("Enter the Name:");
		name=new KBReader1();
		System.out.print("Enter the Age:");
		age=new KBReader1();
		System.out.print("Enter the Salary:");
		salary=new KBReader1();
		System.out.print("Enter the EmailID:");
		emailID=new KBReader1();
		System.out.print("Enter the Designation:");
		designation=new KBReader1();
		System.out.print("Enter the Address:");
		address=new KBReader1();
		System.out.print("Name    :"+name.readString()+"\n");
		
		System.out.print("Age     :"+age.readInt());
		
		System.out.print("Salary  :"+salary.readDouble()+"\n");
		
		System.out.print("Designation  :"+designation.readString()+"\n");
		
		System.out.print("EmailId  :"+emailID.readString()+"\n");
		
		System.out.print("Address :"+address.readString()+"\n");
	}

}
