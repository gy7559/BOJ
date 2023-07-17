package BOJ;
import java.io.*;
import java.util.*;

public class BOJ35 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] all = new int[30];
		for(int q = 0;q<30;q++) {
			all[q] = q+1;
		}
		
		for(int i = 0;i<28;i++) {
			String s = bf.readLine();
			int a = Integer.parseInt(s);
			
			all[a-1]=0;
			
		}
		for(int w = 0;w<30;w++) {
			if(all[w]!=0) {
				System.out.println(all[w]);
			}
		}
		
		
		
		
	}

}
