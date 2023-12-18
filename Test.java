import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Test z wiedzy ogólnej");
        System.out.println("Pytanie 1: Stolica Francji to:");
        System.out.println("a) Londyn, b) Paryż, c) Berlin");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("b")) {
            score++;
        }

        System.out.println("Pytanie 2: Najdłuższa rzeka na świecie to:");
        System.out.println("a) Dunaj, b) Nil, c) Amazonka");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("c")) {
            score++;
        }

        System.out.println("Twój wynik to: " + score + "/2");
    }
}
