package BOJ;

import java.util.*;
import java.io.*;

public class BOJ50 {
//합
	public static void main(String[] args)throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String n = bf.readLine();
		
		int n1 = Integer.parseInt(n);
		int sum = 0;
		for(int d =1; d<(n1+1);d++) {
			sum += d;
		}
		
		System.out.println(sum);
	}

}
