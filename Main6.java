package S2nos;

import java.io.FileInputStream;

public class Main6 {

	public static void main(String[] args) {
		FileInputStream fis;
		int a,u,d,l,s;
		try {
			l=0;
			u=0;
			d=0;
			s=0;
			fis=new FileInputStream("E:\\epsiba rani s\\HelloWorld\\src\\S2nos\\nature.txt");
			a=fis.read();
			while(a!=-1) {
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
			a=fis.read();
			}
			 System.out.print("count of digits :"+d+'\n');
			 System.out.print("count of upper  :"+u+'\n');
			 System.out.print("count of lower  :"+l+'\n');
			 System.out.print("count of special:"+s+'\n');
			}
			catch(Exception e) {
				 System.out.println(e);
			 }
		     }
	         }
