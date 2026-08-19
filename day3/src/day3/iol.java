package day3;
class mytask implements Runnable{
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("method"+i);
		}
	}
}
public class iol {
	public static void main(String[]args) {
		mytask t=new mytask();
		Thread o=new Thread(t);
		o.start();
		for(int i=0;i<8;i++) {
			System.out.println("main method"+i);
			
		}
	}
}

