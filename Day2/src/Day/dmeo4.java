package Day;


	interface Atmt {
		abstract void depo();
	}
	interface Atm1 {
		abstract void min();
	}
	public class dmeo4 implements Atmt, Atm1 {
		public void depo() {
			System.out.println("dep");
		}
		public void min() {
			System.out.println("min");
		}
		public static void main(String[] args) {
			dmeo4 v = new dmeo4();
			v.min();
			v.depo();
		}
	}
