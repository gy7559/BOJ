package BOJ;
import java.io.*;
public class BOJ57 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		double sc = 0.0;
		double gr = 0.0;
		double ssum = 0.0;
		double sgsum = 0.0;
		for(int i=0; i<20;i++) {
			String e = bf.readLine();
			String[] e1 = e.split(" ");
			sc = Double.parseDouble(e1[1]);
			if(e1[2].equals("A+")) {
				gr = 4.5;
			}else if(e1[2].equals("A0")) {
				gr = 4.0;
			}else if(e1[2].equals("B+")) {
				gr = 3.5;
			}else if(e1[2].equals("B0")) {
				gr = 3.0;
			}else if(e1[2].equals("C+")) {
				gr = 2.5;
			}else if(e1[2].equals("C0")) {
				gr = 2.0;
			}else if(e1[2].equals("D+")) {
				gr = 1.5;
			}else if(e1[2].equals("D0")) {
				gr = 1.0;
			}else if(e1[2].equals("F")) {
				gr = 0.0;
			}else if(e1[2].equals("P")) {
				gr = 0.0;
				sc = 0.0;
			}
			ssum += sc;
			sgsum += (sc*gr);
			
		}

		
		double gas = sgsum/ssum;
		System.out.print(gas);
	}

}
