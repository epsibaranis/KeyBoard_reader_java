package S2nos;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class KBReader1 implements java.io.Serializable{
	InputStreamReader isr;
	BufferedReader br;
	String sr;
	int i1;
	float f1;
	double d1;
	short s1;
	long l1;
	public KBReader1() {
		try {
		isr=new InputStreamReader(System.in);
		br=new BufferedReader(isr);
		sr=br.readLine();}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public String readString() {
		try {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			sr=br.readLine();}
			catch(Exception e) {
				System.out.println(e);
			}
		return sr;
	}
	public int readInt() {
		try {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			sr=br.readLine();}
			catch(Exception e) {
				System.out.println(e);
			}
		i1=Integer.parseInt(sr);
			
		return i1;
		}
	
	public float readFloat() {
		try {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			sr=br.readLine();}
			catch(Exception e) {
				System.out.println(e);
			}
		
		f1=Float.parseFloat(sr);
		
		return f1;
	}
	
	public double readDouble() {
		
		try {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			sr=br.readLine();}
			catch(Exception e) {
				System.out.println(e);
			}
		d1=Double.parseDouble(sr);
		
		return d1;
	}
	
	public long readLong() {
		try {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			sr=br.readLine();}
			catch(Exception e) {
				System.out.println(e);
			}
		l1=Long.parseLong(sr);
		
		return l1;
	}
	public short readShot() {
		try {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			sr=br.readLine();}
			catch(Exception e) {
				System.out.println(e);
			}
		s1=Short.parseShort(sr);
		
		return s1;
	}
	

}
