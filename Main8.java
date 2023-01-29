package S2nos;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main8 {

	public static void main(String[] args) {
		FileInputStream fis;
		FileOutputStream fos;
		int a;
		try {
			fos= new FileOutputStream("E:\\\\epsiba rani s\\\\HelloWorld\\\\src\\\\S2nos\\\\nature2.txt");
			fis=new FileInputStream("E:\\epsiba rani s\\HelloWorld\\src\\S2nos\\nature.txt");
			a=fis.read();
			while(a!=-1) {
				fos.write(a);
				a=fis.read();
			}
			
			fis=new FileInputStream("E:\\epsiba rani s\\HelloWorld\\src\\S2nos\\nature1.txt");
			a=fis.read();
			while(a!=-1) {
				fos.write(a);;
				a=fis.read();
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}

	}
	

}

