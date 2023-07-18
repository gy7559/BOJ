package BOJ;
import java.io.*;
import java.util.*;

public class BOJ36 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int z =0;
		int[] n = new int[10];
		for(int t=0;t<10;t++) {
			String s = bf.readLine();
			int c = Integer.parseInt(s);
			n[t] = c%42;
		}
		
		for(int w = 0; w<42;w++) {
			for(int g =0;g<10;g++) {
				if(n[g]==w) {
					z = z+1;
					break;
				}
			}
		}
		
		System.out.println(z);
		
	}

}
