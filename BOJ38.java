package BOJ;
import java.io.*;
import java.util.*;


public class BOJ38 {

	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String n = bf.readLine();
		int n1 = Integer.parseInt(n);
		double max =0;
		String a = bf.readLine();
		String[] a1 = a.split(" "); 
		double[] a2 = new double[n1];
		double sum=0;
		double ser=0;
		
		for(int t=0;t<n1;t++) {
			a2[t]=Double.parseDouble(a1[t]);
		}
		for(int c=0;c<n1;c++) {
			if(max<a2[c]) {
				max = a2[c];
			}
		}
		
		for(int c=0;c<n1;c++) {
				ser = (a2[c]/max) * 100;
				sum=sum+ser;
		}
		double p = sum/n1;
		
		System.out.print(p);
	}

}
