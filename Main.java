import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create an ArrayList of 5 engines and assign values to each of them
        ArrayList<CarEngine> engines = new ArrayList<>();

        // Engine 1
        CarEngine engine1 = new CarEngine("Company A", 200, 3000, 80, 90, 4);
        engines.add(engine1);

        // Engine 2
        CarEngine engine2 = new CarEngine("Company B", 150, 2500, 70, 80, 6);
        engines.add(engine2);

        // Engine 3
        CarEngine engine3 = new CarEngine("Company C", 180, 2800, 75, 85, 4);
        engines.add(engine3);

        // Engine 4
        CarEngine engine4 = new CarEngine("Company D", 220, 3200, 85, 95, 6);
        engines.add(engine4);

        // Engine 5
        CarEngine engine5 = new CarEngine("Company E", 250, 3500, 90, 100, 8);
        engines.add(engine5);

        // Call the printEngineDetails() method to display engine details
        printEngineDetails(engines);
    }

    public static void printEngineDetails(ArrayList<CarEngine> engines) {
        for (CarEngine engine : engines) {
            System.out.println("Company Name: " + engine.getCompanyName());
            System.out.println("Number of Cylinders: " + engine.getNumCylinders());
            System.out.println("Engine Displacement: " + engine.getEngineDisplacement() + " cc");
            System.out.println("Horsepower: " + engine.getHorsePower() + " hp");
            System.out.println("-----------------------------");
        }
    }
}
