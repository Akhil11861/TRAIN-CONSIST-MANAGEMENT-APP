import java.util.*;

class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==============================================\n");

        Map<String, Integer> capacityMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < n; i++) {
            System.out.print("Enter bogie name/number: ");
            String bogie = sc.nextLine();

            System.out.print("Enter capacity: ");
            int capacity = sc.nextInt();
            sc.nextLine();

            capacityMap.put(bogie, capacity);
        }


        System.out.println("\nBogie Capacity Mapping:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " -> Capacity: " + entry.getValue());
        }

        sc.close();
    }
}