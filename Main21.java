package S2nos;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
public class Main21 {

	public static void main(String[] args) {
		ObjectOutputStream oos;
		FileOutputStream fos;
		KBReader1 name;
		Person a1;
		a1=new Person();
		String s;
		try {
			fos=new FileOutputStream("Biodata2");
			oos=new ObjectOutputStream(fos);
			name=new KBReader1();
			System.out.print("Enter the Name:");
			s=name.readString();
			while(!(s).equals("stop")) {
				a1.setName(s);
			System.out.print("Enter the Age:");
			a1.setAge(name.readInt());
			System.out.print("Enter the Address:");
			a1.setAddress(name.readString());
			System.out.println("enter the EmailId:");
			a1.setEmailId(name.readString());
			oos.writeObject(a1);
			oos.flush();
			oos.reset();
			System.out.print("Enter the Name:");
			s=name.readString();			
			}
			oos.close();
			fos.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
