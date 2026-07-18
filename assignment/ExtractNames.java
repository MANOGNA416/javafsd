import java.util.HashMap;

public class ExtractNames {
    public static void main(String[] args) {

        // Roll Number -> Student Name
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Anjali");
        students.put(103, "Kiran");
        students.put(104, "Sneha");

        System.out.println("Student Names:");

        // Extract and print only names
        for (String name : students.values()) {
            System.out.println(name);
        }
    }
}