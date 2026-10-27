import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstNames = {
                "Princess", "Davies", "Emma", "Stacy", "Qasim",
                "Lois", "Collins", "Kerry", "Nalowa", "Sharone"
        };

        String[] lastNames = {
                "Awahnde", "Bamidele", "Johnson", "William", "Agbonlaho",
                "Omage", "Dumebi", "Njangoh", "Martin", "Lee"
        };

        System.out.print("How many names should be generated? ");
        int amount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < amount; i++) {
            int firstIndex = (int) (Math.random() * firstNames.length);
            int lastIndex = (int) (Math.random() * lastNames.length);

            String fullName = firstNames[firstIndex] + " " + lastNames[lastIndex];

            System.out.println(fullName);
        }

        scanner.close();
    }
}
