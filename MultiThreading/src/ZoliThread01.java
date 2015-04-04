
public class ZoliThread01 implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello from a thread!");

	}

	public static void main(String[] args) {
		(new Thread(new ZoliThread01())).start();
		(new Thread(new ZoliThread01())).start();
		(new Thread(new ZoliThread01())).start();
		(new Thread(new ZoliThread01())).start();
		(new Thread(new ZoliThread01())).start();

	}

}
