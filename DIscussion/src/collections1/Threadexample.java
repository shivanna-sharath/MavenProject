package collections1;
class first extends Thread{
	public void run() {
		for( int i=0;i<10;i++) {
			if(i%2==0) {
				
				System.out.println("thread 0"+"    "+ +i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
class second extends Thread{
public void run() {
	for(int i=0;i<10;i++) {
		if(i%2!=0) {
			System.out.println("Thread 1"+"     "+ +i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
		}
		
	}
	
}
}

public class Threadexample {

	public static void main(String[] args) throws InterruptedException {
		first a=new first();
		second b=new second();
		a.start();
	Thread.sleep(10);
		b.start();
		

	}

}
