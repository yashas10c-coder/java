package Day4;

import java.util.Scanner;

public class elcbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[7];
		int h=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++) {
			System.out.println("enter the electricity day "+(i+1)+":");
			arr[i]=sc.nextInt();
			h=h+arr[i];
		}
		System.out.println("total is:"+h+"units");
		sc.close();
	}

}
