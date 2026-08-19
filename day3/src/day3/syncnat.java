package day3;
import java.util.Iterator;
import java.util.Iterator;
class Bank1{
	synchronized void withdraw(int amount) {
		System.out.println("withdraw:"+amount);
		try {
			Thread.sleep(4000);
		}catch(Exception e){
			System.out.println(e);
		}
        System.out.println("Withdrawal completed");
	}
}
class MyThread extends Thread {
    Bank1 bank;
    MyThread(Bank1 bank) {
        this.bank = bank;
    }
    public void run() {
        bank.withdraw(500);
    }
}
public class syncnat {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 bank = new Bank1();
        MyThread t1 = new MyThread(bank);
        MyThread t2 = new MyThread(bank);

        t1.start();
        t2.start();
	}

}
