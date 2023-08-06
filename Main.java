import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);


        int userAnswer = 0;
        int correctAnswer = 1;

        while (!(userAnswer == correctAnswer)){
            int number1 = randomNumber.nextInt(0, 100) + 1;
            int number2 = randomNumber.nextInt(0, 100) + 1;
            correctAnswer = number1 + number2;
            System.out.println("Введите сумму чисел: " + number1 + " + " + number2);
            userAnswer = scanner.nextInt();
            System.out.println("Ваш ответ- " + userAnswer + " Правильный ответ- " + correctAnswer);
        }
        System.out.println("Ура, вы ответили верно!");
    }
}