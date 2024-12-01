package V_E_Thread;

public class Main {
    public static void main(String[] args) {
        int totalResources = 3;
        int totalUsers = 5;

        ResourceManager resourceManager = new ResourceManager(totalResources);

        for (int i = 1; i <= totalUsers; i++) {
            User user = new User(i, resourceManager);
            Thread userThread = new Thread(user);
            userThread.start();
        }
    }
}
