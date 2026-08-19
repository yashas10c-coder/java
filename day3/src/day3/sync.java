package day3;


	import java.util.Iterator;
	import java.util.Iterator;

	class Bank {

	    synchronized void withdraw(int amount) {
	        System.out.println("Withdrawing " + amount);
	        try {
	            Thread.sleep(4000);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        System.out.println("Withdrawal completed");
	    }
	}

	class MyThread1 extends Thread {
	    Bank bank;
	    MyThread1(Bank bank) {
	        this.bank = bank;
	    }
	    public void run() {
	        bank.withdraw(500);
	    }
	}
	public class sync {
	    public static void main(String[] args) {
	        Bank bank = new Bank();
	        MyThread1 t1 = new MyThread1(bank);
	        MyThread1 t2 = new MyThread1(bank);

	        t1.start();
	        t2.start();
	    }
	
}
