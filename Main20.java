package S2nos;
import java.io.ObjectInputStream;
import java.io.ObjectInput;
import java.io.FileInputStream;
import java.io.EOFException;
public class Main20 {

	public static void main(String[] args)throws Exception {
		ObjectInputStream ois1;
		FileInputStream fis1;
		Person a1=new Person();
		try {
			fis1=new FileInputStream("Biodata2");
			ois1=new ObjectInputStream(fis1);
			//System.out.println(ois1.available());
            while((a1=(Person)ois1.readObject())!=null) {
				//a1=(Person)ois1.readObject();
				a1.print();
			}
            fis1.close();
			ois1.close();
		}
		catch(EOFException e) {
			System.out.println("File ended");
		}
		
	}

}
