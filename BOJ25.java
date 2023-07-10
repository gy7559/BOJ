package BOJ;
import java.io.*;
import java.util.*;
public class BOJ25 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String c = bf.readLine();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int c1 = Integer.parseInt(c);
		String t = "";
		for(int x = 0; x<c1;x++) {
			t = t+"*";
			bw.write(t+"\n");
		}
		bw.flush();
		bw.close();
	}
}
