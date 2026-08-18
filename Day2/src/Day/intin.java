package Day;
class Grandparenth{
	void bp() {
		System.out.println("Grandparent");
	}
}
class rek extends Grandparenth{
	void bp() {
		System.out.println("parent");
	}
}
public class intin extends Grandparenth{
	public static void main(String[]args) {
		intin j=new intin();
		j.bp();
	}
}
