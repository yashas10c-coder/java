package Day;

import java.util.Scanner;
public class intsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int j=sc.nextInt();
		int h=0;
		for(int i=j;i>0;i--) {
			 h=h+i;
		}
		System.out.println(h);
		sc.close();
	}

}
