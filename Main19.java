package S2nos;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
public class Main19 {

	public static void main(String[] args) {
		ObjectOutputStream oos;
		FileOutputStream fos;
		KBReader1 name,age,address,emailID;
		Person a1;
		a1=new Person();
		try {
			fos=new FileOutputStream("Biodata1.txt");
			oos=new ObjectOutputStream(fos);
			System.out.print("Enter the Name:");
			name=new KBReader1();
			while(!(name.readString()).equals("stop")) {
				a1.setName(name.readString());
			System.out.print("Enter the Age:");
			age=new KBReader1();
			a1.setAge(age.readInt());
			System.out.print("Enter the Address:");
			address=new KBReader1();
			a1.setAddress(address.readString());
			System.out.println("enter the EmailId:");
			emailID=new KBReader1();
			a1.setEmailId(emailID.readString());
			oos.writeObject(a1);
			System.out.print("Enter the Name:");
			name=new KBReader1();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
