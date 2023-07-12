package BOJ;
import java.io.*;
public class BOJ29 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int e =0;
		String t = bf.readLine();
		int a = Integer.parseInt(t);
		
		
		
		String z = bf.readLine();
		String[] w = z.split(" ");
		int[] w1 = new int[a];
		for(int g = 0;g<a;g++) {
			w1[g]= Integer.parseInt(w[g]);
		}
		String v = bf.readLine();
		int w2 = Integer.parseInt(v);
		
		for(int c=0;c<a;c++) {
			if(w1[c]==w2) {
				e = e+1;
			}
		}
		
		System.out.println(e);
	}

}
