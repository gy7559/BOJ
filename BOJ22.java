package BOJ;
import java.io.*;
import java.util.*;

public class BOJ22 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String c = bf.readLine();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int c1 = Integer.parseInt(c);
		int[] w1 = new int[c1];
		int[] w2 = new int[c1];
		for(int a =0; a<c1;a++) {
			String w = bf.readLine();
			String[] w4 = w.split(" ");
			w1[a] = Integer.parseInt(w4[0]);
			w2[a] = Integer.parseInt(w4[1]);		
		}
		for(int x = 0; x<c1;x++) {
			bw.write(w1[x]+w2[x]+"\n");
		}
		bw.flush();
		bw.close();
	}

}
