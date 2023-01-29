package S2nos;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main13 {

	public static void main(String[] args) {
		InputStreamReader isr1,isr2;
		BufferedReader br1,br2;
		try {System.out.print("Enter the first number:");
			isr1=new InputStreamReader(System.in);
			br1=new BufferedReader(isr1);
			String sr1=br1.readLine();	
			System.out.print("Enter the Second number:");
			isr2=new InputStreamReader(System.in);
			br2=new BufferedReader(isr2);
			String sr2=br2.readLine();	
			int m1=Integer.parseInt(sr1);
			int m2=Integer.parseInt(sr2);
			int m3=m1*m2;
			System.out.print("Product of the two integers:"+m3);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
