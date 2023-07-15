package BOJ;
import java.io.*;
import java.util.*;

public class BOJ32 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] list = new int[9];
		int s = 0;
		int a = 0;
		for(int i = 0;i<9;i++) {
			String l = bf.readLine();
			list[i] = Integer.parseInt(l);
			if(a<list[i]) {
				a = list[i];
				s = i;
			}
		}
		System.out.println(a);
		System.out.println(s+1);
	}

}
