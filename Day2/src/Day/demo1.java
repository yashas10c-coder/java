package Day;

class GrandParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parelnt extends GrandParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class demo1 extends Parelnt{

	public static void main(String[] args) {
 		demo1  bb= new demo1();
 		bb.bp();
 		bb.cancer();
	}
}
