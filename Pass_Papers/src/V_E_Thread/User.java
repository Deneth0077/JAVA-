package V_E_Thread;

public class User extends Thread{
    private final int userId;
    private final ResourceManager resourceManager;

    public User(int userId, ResourceManager resourceManager) {
        this.userId = userId;
        this.resourceManager = resourceManager;
    }

    @Override
    public void run() {
        try {
            while (true) {
                resourceManager.requestResource(userId);
                Thread.sleep(1000); // Simulate holding the resource for a while
                resourceManager.releaseResource(userId);
                Thread.sleep(1000); // Simulate some delay before requesting again
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
