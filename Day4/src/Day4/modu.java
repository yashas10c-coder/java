package Day4;
import java.util.*;
public class modu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value:");
		int n=sc.nextInt();
		int remd=n%2;
		System.out.println("Result:"+remd);
		if(remd==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
		sc.close();
	}

}
