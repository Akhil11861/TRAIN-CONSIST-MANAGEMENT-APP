import java.util.*;

class TrainBogieApp {

    public static void insertBogie(List<Integer> trainConsist, int bogieNumber) {
        int i = 0;


        while (i < trainConsist.size() && trainConsist.get(i) < bogieNumber) {
            i++;
        }


        trainConsist.add(i, bogieNumber);
    }


    public static void display(List<Integer> trainConsist) {
        System.out.println("Train Bogie Consist:");
        for (int bogie : trainConsist) {
            System.out.print(bogie + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=====================================\n");

        List<Integer> trainConsist = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.print("Enter bogie number: ");
            int bogie = sc.nextInt();
            insertBogie(trainConsist, bogie);
        }

        display(trainConsist);

        sc.close();
    }
}