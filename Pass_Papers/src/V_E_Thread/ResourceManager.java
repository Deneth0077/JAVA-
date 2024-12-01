package V_E_Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceManager {

    private final int totalResources;
    private int availableResources;
    private final Lock lock;
    private final Condition resourceAvailable;

    public ResourceManager(int totalResources) {
        this.totalResources = totalResources;
        this.availableResources = totalResources;
        this.lock = new ReentrantLock();
        this.resourceAvailable = lock.newCondition();
    }

    public void requestResource(int userId) {
        lock.lock();
        try {
            while (availableResources == 0) {
                System.out.println("User " + userId + " is waiting for a resource.");
                resourceAvailable.await();
            }
            availableResources--;
            System.out.println("User " + userId + " acquires a resource. Available resources: " + availableResources);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("User " + userId + " was interrupted while waiting for a resource.");
        } finally {
            lock.unlock();
        }
    }

    public void releaseResource(int userId) {
        lock.lock();
        try {
            availableResources++;
            System.out.println("User " + userId + " releases a resource. Available resources: " + availableResources);
            resourceAvailable.signal();
        } finally {
            lock.unlock();
        }
    }

}

