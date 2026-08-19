package day3;

public class exit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("anand");
		
		try {
			System.out.println("anand");
			System.exit(0);
			System.out.println(10 / 0);
		} catch (ArithmeticException ne) {
			System.out.println("u r getting ne " + ne);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}

}
