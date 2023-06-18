package BOJ;
import java.util.Scanner;
public class BOJ05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//입력받는 인스턴스 생성
        int a = sc.nextInt();//입력받아 실수로 a에 입력
        int b = sc.nextInt();//입력받아 실수로 b에 입력
        sc.close();
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

	}

}
