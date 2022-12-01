package job_portal_system;

import java.util.ArrayList;
public class Main implements Runnable {
	public static void main(String[] args) {
	    Main obj = new Main();
	    Thread thread = new Thread(obj);
	    thread.start();
	

	}

	@Override
	public void run() {
		FirstPage fp = new FirstPage();
	
	}
}
