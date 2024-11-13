import java.util.*;

// Step 1: Define a common Notification class
class Notification {
    private String id;
    private String message;

    public Notification(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Notification{id='" + id + "', message='" + message + "'}";
    }
}