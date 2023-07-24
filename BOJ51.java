package BOJ;

import java.util.*;
import java.io.*;
public class BOJ51 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String ch = bf.readLine();
		
		String[] ch1 = ch.split(" "); 
		int[] w = {1,1,2,2,2,8};
		int[] w1 = new int[6];
		for(int i=0;i<6;i++) {
			int t = Integer.parseInt(ch1[i]);
			
			w1[i] = w[i] - t;
			
			System.out.print(w1[i] + " ");
		}
		
	}

}
