package BOJ;
import java.util.*;
import java.io.*;

public class BOJ15 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] s2 = s.split(" ");
		
		int[] a = new int[s2.length];
		int h = 0;
		int m = 0;
		for(int x =0;x<s2.length;x++) {
		 a[x] = Integer.parseInt(s2[x]);
		}
		h = a[0];
		m = a[1]-45;
		if(m<0) {
			h = h-1;
			m = m+60;
		}
		if(h<0) {
			h = h+24;
		}
		System.out.println(h+" "+m);
	}

}
