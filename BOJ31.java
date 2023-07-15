package BOJ;
import java.io.*;
import java.util.Arrays;
public class BOJ31 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String n = bf.readLine();
		String line = bf.readLine();
		
		String[] line1 = line.split(" ");
		int n1 = Integer.parseInt(n);
		int[] lineint = new int[n1];
		for(int i=0;i<n1;i++) {
			lineint[i] = Integer.parseInt(line1[i]);
		}
		
		Arrays.sort(lineint);
		System.out.println(lineint[0]+" "+ lineint[n1-1]);
	}

}
