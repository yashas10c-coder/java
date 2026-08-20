package Day4;

import java.util.Scanner;

public class highmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[5];
		int h=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("enter the student no"+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			if(arr[i]>h) {
				h=arr[i];
			}
		}
		System.out.println(h);
		sc.close();
	}

}
