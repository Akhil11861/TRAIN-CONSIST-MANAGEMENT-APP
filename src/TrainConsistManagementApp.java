import java.util.ArrayList;
import java.util.List;

class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("==============================================\n");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Bogie1");
        passengerBogies.add("Bogie2");
        passengerBogies.add("Bogie3");

        System.out.println("Passenger bogies added successfully!");
        System.out.println("Current Train Consist: " + passengerBogies);
        System.out.println("Total bogies: " + passengerBogies.size());
    }
}