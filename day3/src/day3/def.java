package day3;

public class def extends Thread{
	@Override
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("method"+i);
		}
	}
	public static void main(String[]args) {  
		def j=new def();
		j.start();
		for(int i=0;i<8;i++) {
			System.out.println("main method"+i);
		}
	}
}

