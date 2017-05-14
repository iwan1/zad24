package zad24;

public class main {
	public static void main(String args[]) throws InterruptedException {
	    Watek a1 = new Watek(1,20);
	    Watek a2 = new Watek(1,20);
	    Watek a3 = new Watek(1,20);
	    Watek a4 = new Watek(1,20);
	    Watek a5 = new Watek(1,20);
	    Watek a6 = new Watek(1,20);
	    Watek a7 = new Watek(1,20);
	    Watek a8 = new Watek(1,20);
	    Watek a9 = new Watek(1,20);
	    Watek a10 = new Watek(1,20);
	    
	    a1.start();
	    a1.join();
	    a2.start();
	    a2.join();
	    a3.start();
	    a3.join();
	    a4.start();
	    a4.join();
	    a5.start();
	    a5.join();
	    a6.start();
	    a6.join();
	    a7.start();
	    a7.join();
	    a8.start();
	    a8.join();
	    a9.start();
	    a9.join();
	    a10.start();
	    a10.join();
	    }
}
