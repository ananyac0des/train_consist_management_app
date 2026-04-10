import java.util.*;

class GoodsBogie {
    String type;   // Cylindrical, Rectangular, etc.
    String cargo;  // Petroleum, Coal, Grain, etc.

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " - Cargo: " + cargo;
    }
}

public class trainmanagementapp {

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Grain"));

        // Step 2: Convert list → stream → extract capacity → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);     // sum all values
//new
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}