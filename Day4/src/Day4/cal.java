package Day4;
import java.util.*;

public class cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		while(true) {
		
		System.out.println("Enter the integer 1:");
		int n1=s.nextInt();
		System.out.println("Enter the integer 2:");
		int n2=s.nextInt();
		System.out.println("1).add,2)sub,3)mul,4)div:");
		System.out.println("Enter the choice:");
		int y=s.nextInt();
		switch(y) {
		case 1:
			System.out.println("add:"+(n1+n2));
			break;
		case 2:
			System.out.println("sub:"+(n1-n2));
			break;
		case 3:
			System.out.println("mult:"+(n1*n2));
			break;
		case 4:
			try {
				int i=n1/n2;
				System.out.println("div:"+(n1/n2));
			}catch(ArithmeticException e) {
				System.out.println("zero division error" + e);
			}
			
			break;
		default:
			System.out.println("invalid enter");
		}
		}
		
	}

}
