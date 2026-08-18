package Day;


	class parentp
	{
	   int a =10;
			   int b =20;
	}

	public class dmeo1 extends parentp {
		int a=20;
		int b =30;
		
		void add(int a , int b)
		{
			System.out.println(super.a+super.b);
			System.out.println(this.a+this.b);
			System.out.println(a+b);
		}
	public static void main(String[] args) {
		dmeo1 jj = new dmeo1();
		jj.add(2, 3);
		
	}
	}

