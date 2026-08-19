package day3;

class Banklo {

    synchronized void thred() {
        System.out.println("thread entering");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("thread task completed");
        
    }
    synchronized void thredi() {
        System.out.println("thread entering");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("thread task completed");
    }
}

class MyThread2 extends Thread {
	Banklo banklo;
    MyThread2(Banklo banklo) {
        this.banklo = banklo;
    }
    public void run() {
    	banklo.thred();
    	banklo.thredi();
    }
}
public class hkl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banklo k=new Banklo();
		MyThread2 p=new MyThread2(k);
		MyThread2 i=new MyThread2(k);
		i.run();
		p.run();
	}

}
