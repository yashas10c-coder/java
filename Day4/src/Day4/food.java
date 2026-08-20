package Day4;

import java.util.Scanner;

public class food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter week day:1)pizz,2)buger,3)sandwich,4)pasta,5)roti:");
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("pizz");
			break;
		case 2:
			System.out.println("buger");
			break;
		case 3:
			System.out.println("sandwich");
			break;
		case 4:
			System.out.println("pasta");
			break;
		case 5:
			System.out.println("roti");
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}
