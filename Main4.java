package S2nos;

import java.io.FileOutputStream;

public class Main4 {

	public static void main(String[] args) 
	{
	FileOutputStream fos; 
	try {
		fos= new FileOutputStream("x data");
		char a;
		a=(char)System.in.read();
		while(a!='$') {
			fos.write(a);;
			a=(char)System.in.read();
		}
		}
	catch(Exception e) {
		 System.out.println(e);
	 }
		
	}

}
