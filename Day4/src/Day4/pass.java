package Day4;

import java.util.Scanner;

public class pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=40;
		int []arr=new int[7];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++) {
			System.out.println("enter the student no"+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<7;i++) {
			if(arr[i]>=y) {
				System.out.println("student no"+(i+1)+"pass");
			}else {
				System.out.println("student no"+(i+1)+"fail");
			}
		}
		sc.close();
	}

}
