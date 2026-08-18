package Day;
class parentl{
	void cancer() {
		System.out.println("x");
	}
	void bp() {
		System.out.println("bp");
	}
}
public class intd extends parentl {
	public static void main(String[]args) {
		intd bb =new intd();
		bb.cancer();
		bb.bp();
	}
}
