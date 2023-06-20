package BOJ;
import java.util.*;
public class BOJ09 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      int a = scan.nextInt();//(100<=a<1000)
	      int b = scan.nextInt();//(100<=b<1000)
	      System.out.println(a*(b%10));
	      System.out.println(a*((b%100)/10));
	      System.out.println(a*(b/100));
	      System.out.println(a*b);
	}

}
