package Day;
class Parent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	void bp()
	{
		System.out.println(" understain   bp");
	}
}

public class demo extends Parent{

	public static void main(String[] args) {
 		demo  bb= new demo();
 		bb.bp();
 		bb.cancer();
	}
}