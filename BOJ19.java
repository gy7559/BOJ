package BOJ;

import java.io.*;
import java.util.*;

public class BOJ19 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String e = bf.readLine();
		int d = Integer.parseInt(e);
		int[] q = new int[d];
		int[] p = new int[d];
		for(int a = 0; a < d;a++) {
			
			String c = bf.readLine();
			String[] c2 = c.split(" ");
			q[a] = Integer.parseInt(c2[0]);
			p[a] = Integer.parseInt(c2[1]);
		}
		
		for(int x = 0; x<d;x++) {
			System.out.println(q[x]+p[x]);
		}
	}

}
