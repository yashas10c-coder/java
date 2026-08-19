package day3;

public class finaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("anand");
			System.out.println(10 / 0);
		} catch (ArithmeticException ne) {
			System.out.println("u r getting ne " + ne);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}

}
