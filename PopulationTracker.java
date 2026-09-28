public class PopulationTracker {
    public static void main(String[] args) {
        // Storing estimated 2026 population figures using 'long' data type
        long indiaPopulation = 1476625576L;
        long chinaPopulation = 1412914089L;

        // Printing the results
        System.out.println("--- Country Population Statistics ---");
        System.out.println("India Population : " + indiaPopulation);
        System.out.println("China Population : " + chinaPopulation);

        // Comparing the populations
        if (indiaPopulation > chinaPopulation) {
            System.out.println("\nIndia currently has the higher population.");
        } else {
            System.out.println("\nChina currently has the higher population.");
        }
    }
}
