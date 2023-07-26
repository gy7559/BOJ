package BOJ;
import java.io.*;
public class BOJ56 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] w = new String[5][15];
		for(int i=0;i<5;i++) {
			String s =	bf.readLine();
			String[] t = s.split("");
			for(int e=0;e<t.length;e++) {
				//System.out.print(t[e] + " ");
				w[i][e] = t[e];
			}
		}
		int v=0;
		
		for(int i=0;i<5;i++) {
			if(w[v].length>w[i].length) {
				v = i;
			}
		}
		
		for(int e=0;e<w[v].length;e++) {
			for(int i=0;i<5;i++) {
				if(w[i][e]!=null) {
					System.out.print(w[i][e]);	
				}
			}
		}
	}

}
