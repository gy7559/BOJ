package BOJ;
import java.io.*;
public class BOJ45 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 
		String N = bf.readLine();
		
		int n = Integer.parseInt(N);
		String[] r = new String[n];
		
		for(int t = 0;t<n;t++) {
			
			String w = bf.readLine();
			String[] w1= w.split(" ");
			
			int q = Integer.parseInt(w1[0]);
			String[] z = w1[1].split("");
			String g= "";
			
			for(int c = 0;c<w1[1].length();c++) {
				for(int x = 0;x<q;x++) {
					g = g.concat(z[c]);
				}
			}
			
			
			 
		}
		
		for(int v =0; v<n;v++) {
			System.out.println(r[v]);
		}
	}

}
