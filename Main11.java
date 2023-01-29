package S2nos;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main11 {

	public static void main(String[] args) {
		InputStreamReader isr;
		BufferedReader br;
		try {
		isr=new InputStreamReader(System.in);
		br=new BufferedReader(isr);
		System.out.println(br.readLine());		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
