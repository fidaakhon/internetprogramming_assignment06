package AssignmentNo6;

public class Main {
    public static void main(String[] args) {
        Person p1 = Person.getInstance();
        System.out.println("p1: " + p1);

        Person p2 = Person.getInstance();
        System.out.println("p2: " + p2);

        // Both instances should have the same hashcode
        System.out.println("Hashcode p1: " + System.identityHashCode(p1));
        System.out.println("Hashcode p2: " + System.identityHashCode(p2));
    }
}

