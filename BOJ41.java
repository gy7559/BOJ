package BOJ;

import java.io.*;
import java.util.*;

public class BOJ41 {

	public static void main(String[] args)throws IOException {
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String n = bf.readLine();
		int n1 = Integer.parseInt(n);
		String[] w = new String[n1];
		char d;
		for(int a=0;a<n1;a++) {
			String t = bf.readLine();
			d = t.charAt(t.length()-1);
			w[a]= t.substring(0,1);
			w[a]= w[a]+d;
		}
	
		for(int i = 0; i<n1;i++) {
			System.out.println(w[i]+" ");
		}
	}
}
