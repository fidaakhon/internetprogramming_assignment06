package AssignmentNo6;

public class Person {
    private static volatile Person instance;

    // Other attributes of the Person class
    private int autoId;
    private String username;
    private String password;
    private String gender;

    // Private constructor to prevent instantiation
    private Person() {
        // Initialization of attributes
        this.autoId = 0;
        this.username = "default";
        this.password = "default";
        this.gender = "unknown";
    }

    public static Person getInstance() {
        // Double-checked locking for thread safety
        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null) {
                    instance = new Person();
                }
            }
        }
        return instance;
    }

    // Other methods, getters, and setters

    @Override
    public String toString() {
        return "Person{" +
                "autoId=" + autoId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

