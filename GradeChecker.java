import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score (0-100): ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("Grade: B");
        } else if (score >= 80) {
            System.out.println("Grade: C");
        } else if (score >= 70) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
