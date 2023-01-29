package S2nos;
import java.io.InputStreamReader;
public class Main10 {
     
	public static void main(String[] args) {
		InputStreamReader isr;
		char a;
		try {
			//a=System.in.read();
			isr=new InputStreamReader(System.in);
			a=(char)isr.read();
			while(a!='$') {				
				System.out.print(a);
				a=(char)isr.read();
				}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
