package S2nos;
import java.io.FileInputStream;
import java.io.DataInputStream;
public class Main18 {
 
	public static void main(String[] args) {
		FileInputStream fis;
		DataInputStream dis;
        try {
        	fis=new FileInputStream("Biodata.txt");
    		dis=new DataInputStream(fis);
        	while(dis.available()>0) {
        		String name=dis.readUTF();
    			int age=dis.readInt();
    			String designation=dis.readUTF();
    			Double salary=dis.readDouble();
    			String address=dis.readUTF();
    			System.out.print("Name  :"+name+"\n");
    			System.out.print("Age  :"+age+"\n");
    			System.out.print("Designation  :"+designation+"\n");
    			System.out.print("Salary  :"+salary+"\n");
    			System.out.print("Address  :"+address+"\n");
        	}
        }
        catch(Exception e) {
			System.out.println(e);
		}
	}

}
