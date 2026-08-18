package Day;

public class star {
	public static void main(String[]args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0;i>8;i++){
			for(int j=8;j>0;j--) {
				System.out.print("*"+" ");
			}
			System.out.println("*");
		}
	}
}
