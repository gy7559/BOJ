package BOJ;

import java.io.*;
import java.util.*;

public class BOJ21 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String c = bf.readLine();
		int c1 = Integer.parseInt(c);
		
		for(int a = 0; a<c1/4;a++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}

}
