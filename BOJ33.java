package BOJ;

import java.util.*;
import java.io.*;


public class BOJ33 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader((System.in)));
		String nm = bf.readLine();
		String[] nm1 = nm.split(" ");
		int n = Integer.parseInt(nm1[0]);
		int m = Integer.parseInt(nm1[1]);
		
		int[] n1 = new int[n];
		for(int c=0;c<m;c++) {
			String ijk = bf.readLine();
			String[] ijk1 = ijk.split(" ");
			int i = Integer.parseInt(ijk1[0]);
			int j = Integer.parseInt(ijk1[1]);
			int k = Integer.parseInt(ijk1[2]);
			for(int i1=(i-1);i1<j;i1++) {
				n1[i1]=k;
			}
			
		}
		for(int g =0;g<n;g++) {
			System.out.print(n1[g]+" ");
		}
		
	}

}
