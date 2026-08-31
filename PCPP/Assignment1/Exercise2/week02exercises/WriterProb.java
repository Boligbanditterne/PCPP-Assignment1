// For week 2
// sestoft@itu.dk * 2014-08-25
// raup@itu.dk * 2021-09-03
package exercises02;

public class WriterProb {
	static int readers = 0;
	static boolean writer = false;

	public synchronized void readLock(){
		try{
			while(writer){
				wait();
			}
			readers++;
		}
		catch(InterruptedException e){
			System.out.println("cooked: " + e);
		}
    	
	}

	public synchronized  void readUnlock(){
		readers--;
        if(readers==0){
			notifyAll();
		}
	}

	public synchronized void writeLock(){
		try {
			while(readers > 0 || writer){
				wait();
				
			}
			writer=true;
		} 
		catch (InterruptedException e) {
			System.out.println("cookedWrite: " + e);
		}
		
	}

	public synchronized void writeUnlock(){
		while(readers > 0 || writer){
			writer=false;
			notifyAll();
        }
	}
	

}