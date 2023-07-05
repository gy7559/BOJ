package BOJ;

import java.io.*;
import java.util.*;

public class BOJ20 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String sum = bf.readLine();
		int s = Integer.parseInt(sum);
		
		String h = bf.readLine();
		
		int ha = Integer.parseInt(h);
		int[] w = new int[ha];
		int w2=0;
		
		for(int x=0; x<ha;x++) {
			String q = bf.readLine();
			String[] q2 = q.split(" ");
			int m = Integer.parseInt(q2[0]);
			int g = Integer.parseInt(q2[1]);
			
			w[x] = m*g;
		}
		for(int v =0;v<ha;v++) {
			w2=w2+w[v];
		}
		
		if(w2==s) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
