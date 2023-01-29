package S2nos;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
public class Main15 {
	public static void main(String[] args) {
		FileOutputStream fos;
		DataOutputStream dos;
		KBReader1 name,age,salary,designation,address;
		try {
		fos=new FileOutputStream("Biodata.txt");
		dos=new DataOutputStream(fos);
		System.out.print("Enter the Name:");
		name=new KBReader1();
		System.out.print("Enter the Age:");
		age=new KBReader1();
		System.out.print("Enter the Salary:");
		salary=new KBReader1();
		System.out.print("Enter the Designation:");
		designation=new KBReader1();
		System.out.print("Enter the Address:");
		address=new KBReader1();
		dos.writeUTF(name.readString());
		dos.writeInt(age.readInt());
		dos.writeUTF(designation.readString());
		dos.writeDouble(salary.readDouble());
		dos.writeUTF(address.readString());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
