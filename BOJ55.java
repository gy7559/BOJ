package BOJ;
import java.io.*;
public class BOJ55 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		int max=0;
		int n = 0;
		int m = 0;

		for(int i=0;i<9;i++) {
			String t = bf.readLine();
			String[] t1 = t.split(" ");
			for(int j=0;j<9;j++) {
				arr[i][j] = Integer.parseInt(t1[j]);
				
				if(arr[i][j]>=max) {
					max = arr[i][j];
					n = i+1;
					m = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.print(n+ " "+m);
	}

}
