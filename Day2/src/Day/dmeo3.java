package Day;


	interface Atm
	{
		abstract void depo();	
		abstract void with();
	}
	abstract class Abc implements Atm
	{	
		public	void depo()
		{
			System.out.println("Depos");
		}
		}

	public class dmeo3 extends Abc{

		public	void with()
		{
			System.out.println("With");
		}

		
	public static void main(String[] args) {
		dmeo3   v = new dmeo3();
		v.depo();
		v.with();
	}
	}

