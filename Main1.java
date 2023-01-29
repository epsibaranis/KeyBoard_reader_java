package S2nos;

public class Main1 {

	public static void main(String[] args) {
	 try {
		char a;
		a=(char) System.in.read();
		while(a!='$'){
			System.out.print(a);
			a=(char) System.in.read();
	}}
	 catch(Exception e) {
		 System.out.println(e);
	 }
	}
}
