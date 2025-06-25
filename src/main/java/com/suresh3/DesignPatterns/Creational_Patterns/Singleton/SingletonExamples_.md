//Singleton class to manage the state of the application in java
public class AppState {
    private static AppState instance;
    private String currentUser;
    private boolean isLoggedIn;

    private AppState() {
        this.currentUser = null;
        this.isLoggedIn = false;
    }

    public static AppState getInstance() {
        if (instance == null) {
            instance = new AppState();
        }
        return instance;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}

