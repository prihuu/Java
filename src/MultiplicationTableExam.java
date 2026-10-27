import java.util.Scanner;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score;

        do {
            score = 0;

            for (int i = 1; i <= 10; i++) {
                int number1 = (int) (Math.random() * 10) + 1;
                int number2 = (int) (Math.random() * 10) + 1;

                System.out.print(number1 + " * " + number2 + " = ");
                int answer = Integer.parseInt(scanner.nextLine());

                if (answer == number1 * number2) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect!");
                }
            }

            System.out.println("Your score: " + score + "/10");

            if (score == 10) {
                System.out.println("Congratulations! You have mastered the multiplication tables!");
            } else {
                System.out.println("Try again!");
            }

        } while (score < 10);

        scanner.close();
    }
}
