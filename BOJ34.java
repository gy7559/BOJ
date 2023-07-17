package BOJ;
import java.util.*;
import java.io.*;
public class BOJ34 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String nm = bf.readLine();
		String[] nm1 = nm.split(" ");
		int n = Integer.parseInt(nm1[0]);
		int m = Integer.parseInt(nm1[1]);
		
		int[] n1 = new int[n];
		
		int change = 0;
		
		for(int a=0;a<n;a++) {
			n1[a] = a+1;
		}
		
		
		for(int q = 0;q<m;q++) {
			String ij = bf.readLine();
			String[] ij1 = ij.split(" ");
			int i = Integer.parseInt(ij1[0]);
			int j = Integer.parseInt(ij1[1]);
			change = n1[i-1];
			n1[i-1] = n1[j-1];
			n1[j-1] = change;
		}
		
		
		
		for(int h =0;h<n;h++) {
			System.out.print(n1[h]+" ");
		}
	}

}
