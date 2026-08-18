package Day;
class Grandparent{
	void bp() {
		System.out.println("Grandparent");
	}
}
class re extends Grandparent{
	void cancer() {
		System.out.println("parent");
	}
}
public class intmul extends re{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intmul h=new intmul();
		h.bp();
		h.cancer();
	}

}
