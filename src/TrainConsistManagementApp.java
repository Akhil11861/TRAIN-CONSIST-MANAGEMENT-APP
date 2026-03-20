import java.util.*;
class BogieFormationApp {

    static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=========================================\n");

        Set<String> formation = new LinkedHashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter bogie name/number: ");
            String bogie = sc.nextLine();
            formation.add(bogie);
        }

        System.out.println("\nBogie Formation (Insertion Order Preserved):");
        for (String b : formation) {
            System.out.print(b + " ");
        }

        sc.close();
    }
}