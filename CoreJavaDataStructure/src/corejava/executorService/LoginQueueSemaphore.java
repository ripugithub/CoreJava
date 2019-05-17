package corejava.executorService;

import java.util.concurrent.Semaphore;

public class LoginQueueSemaphore {
		
	private Semaphore semaphore;
	
 
    boolean tryLogin() {
        return semaphore.tryAcquire();
    }
 
    void logout() {
        semaphore.release();
    }
 
    int availableSlots() {
        return semaphore.availablePermits();
    }

}
