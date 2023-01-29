package S2nos;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.*;
public class Main9 {

	public static void main(String[] args) {
	FileInputStream fis1,fis2,fis3,fis4,fis5;
	SequenceInputStream sis;
	int a;
	try {
		fis1=new FileInputStream("E:\\epsiba rani s\\HelloWorld\\src\\S2nos\\nature.txt");
		fis2=new FileInputStream("E:\\epsiba rani s\\HelloWorld\\src\\S2nos\\fire.txt");
		fis3=new FileInputStream("E:\\epsiba rani s\\HelloWorld\\src\\S2nos\\land.txt");
		fis4=new FileInputStream("E:\\epsiba rani s\\HelloWorld\\src\\S2nos\\air.txt");
		fis5=new FileInputStream("E:\\epsiba rani s\\HelloWorld\\src\\S2nos\\sky.txt");
		Vector v=new Vector();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		v.add(fis4);
		v.add(fis5);
		Enumeration e=v.elements();
		sis=new SequenceInputStream(e);
		a=sis.read();
		while(a!=-1) {
			System.out.print((char)a);
			a=sis.read();
			}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
