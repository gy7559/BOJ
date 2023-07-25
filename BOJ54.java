package BOJ;
import java.io.*;
public class BOJ54 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String nm = bf.readLine();
		
		String[] nm1 = nm.split(" ");
		int n = Integer.parseInt(nm1[0]);
		int m = Integer.parseInt(nm1[1]);
		int[][] a = new int[n][m]; 
 		int[][] b = new int[n][m];
 		
		for(int i = 0; i<n;i++) {
			String e =  bf.readLine();
			String[] e1 = e.split(" ");
			for(int t = 0;t<m;t++){
				a[i][t] = Integer.parseInt(e1[t]);
			}
		}
		
		for(int i = 0; i<n;i++) {
			String e =  bf.readLine();
			String[] e1 = e.split(" ");
			for(int t = 0;t<m;t++){
				b[i][t] = Integer.parseInt(e1[t]);
				
				b[i][t] += a[i][t]; 
				
				System.out.print(b[i][t]+" ");
			}
			System.out.println("");
		}
		
		
		
		
	}

}
