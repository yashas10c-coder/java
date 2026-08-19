package day3;

public class exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("anand");
		int a=10/0;
		try {
			System.out.println(a);
		} catch (ArithmeticException ne) {
			System.out.println("u r getting ne " + ne);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}

}
