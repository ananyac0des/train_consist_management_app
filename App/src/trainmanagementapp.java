import java.util.HashSet;
import java.util.Set;

public class trainmanagementapp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display all unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIDs);
    }
}