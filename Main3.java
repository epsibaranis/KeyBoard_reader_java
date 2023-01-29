package S2nos;

public class Main3 {

	public static void main(String[] args) {
	try {
		int u,l,d,s;
		char a;
		a=(char)System.in.read();
		l=0;
		u=0;
		d=0;
		s=0;
		while(a!='$') {
		if(a>=48 && a<=57)
		 d++;	
		else
		if(a>=65 && a<=90)
		u++;
		else 
			 if(a>=97 && a<=122)
				 l++;	
		 else 
				 s++;
			
		 
		
	
		a=(char)System.in.read();
		}
		System.out.print("count of digits :"+d+'\n');
		System.out.print("count of upper  :"+u+'\n');
		System.out.print("count of lower  :"+l+'\n');
		System.out.print("count of special:"+s+'\n');
	}
	catch(Exception e) {
		System.out.print(e);
	}
	}
}
