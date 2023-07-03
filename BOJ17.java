package BOJ;

import java.io.*;
import java.util.*;

public class BOJ17 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] s2 = s.split(" ");
		int[] a = new int[s2.length];
		for(int x =0;x<s2.length;x++) {
		 a[x] = Integer.parseInt(s2[x]);
		}
		
		Arrays.sort(a);
		
		if(a[2]==a[0]&&a[2]==a[1]) {
			int t = 10000 + a[2]*1000;
			System.out.println(t);
		}else if(a[2]==a[0]||a[2]==a[1]) {
			int d = 1000 + a[2]*100;
			System.out.println(d);
		}else if(a[1]==a[0]) {
			int d = 1000 + a[1]*100;
			System.out.println(d);
		}else {
			System.out.println(a[2]*100);
		}
		
		
		
	}
	

}
