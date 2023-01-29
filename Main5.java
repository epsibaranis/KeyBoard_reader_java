package S2nos;

import java.io.FileInputStream;

public class Main5 {

	public static void main(String[] args) {
		FileInputStream fis;
		int a;
		try {
			fis=new FileInputStream("x data");
			a=fis.read();
			while(a!=-1) {
				System.out.print((char)a+"");
				a=fis.read();
			}
		
		}
			catch(Exception e) {
				 System.out.println(e);
			 }
			
		

	}

}
