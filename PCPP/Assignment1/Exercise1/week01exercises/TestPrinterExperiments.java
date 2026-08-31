// For week 1
// sestoft@itu.dk * 2014-08-21
// raup@itu.dk * 2021-08-27
package exercises01;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class TestPrinterExperiments {

    Printer p1 = new Printer();

    public TestPrinterExperiments() {

        Thread t1 = new Thread(() -> {
	    while(true){
		    p1.print();
            }});
        Thread t2 = new Thread(() -> {
	    while(true){
		    p1.print();
            }});
        t1.start(); t2.start();
        try { t1.join(); t2.join(); }
        catch (InterruptedException exn) {
            System.out.println("Some thread was interrupted");
        }
    }

    public static void main(String[] args) {
        new TestPrinterExperiments();
    }

    class Printer {
	Lock l = new ReentrantLock();
	public void print() {
		l.lock();
		System.out.print("-");
		try { Thread.sleep(50); } catch (InterruptedException exn) { }
		System.out.print("|");
		l.unlock();
        }
    }
}
