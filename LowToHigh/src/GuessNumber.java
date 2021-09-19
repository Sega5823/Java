import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Создаем переменную типа int
        int randInt;

        //Сохраняем случайное число в переменной randInt;
        randInt = rand.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Угадай число:");
        int number = scanner.nextInt();

        while (randInt != number) {
            if (randInt > number){
                System.out.println("Загаданное мною число больше");
            } else {
                System.out.println("Загаданное мною число меньше");
            }
            number = scanner.nextInt();
        }

        System.out.println("Совершенно верно! Это и есть загаданное мною число!");
    }
}
