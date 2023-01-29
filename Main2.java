package S2nos;

public class Main2 {

	public static void main(String[] args) {
		try { int i;
			char a;
			i=0;
			a=(char) System.in.read();
			while(a!='$'){
				if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U') 
					i=i+1;
				a=(char) System.in.read();
			
		}System.out.println("Vowles count:"+i);}
		 catch(Exception e) {
			 System.out.println(e);
		 }
		}
}
