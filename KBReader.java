package S2nos;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class KBReader {
		InputStreamReader isr;
		BufferedReader br;
		String sr;
		public KBReader() {
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
		}
		public String readString() {
			String ex="not string";
			try {
			sr=br.readLine();
			return sr;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return ex;
		}
		public int readInt() {
			int n1=0;
			try {
			sr=br.readLine();
			int m1=Integer.parseInt(sr);
			return m1;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return n1;
		}
		public float readFloat() {
			float n1=0;
			try {
			sr=br.readLine();
			float m1=Float.parseFloat(sr);
			return m1;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return n1;
		}
		public double readDouble() {
			double n1=0;
			try {
			sr=br.readLine();
			double m1=Double.parseDouble(sr);
			return m1;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return n1;
		}
		public long readLong() {
			long n1=0;
			try {
			sr=br.readLine();
			long m1=Long.parseLong(sr);
			return m1;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return n1;
		}
		public short readShot() {
			short n1=0;
			try {
			sr=br.readLine();
			short m1=Short.parseShort(sr);
			return m1;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return n1;
		}
}
