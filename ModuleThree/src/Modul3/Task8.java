package Modul3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String text = "Жили-были старик со старухой.\n"
                + "Вот и говорит старик старухе:\n"
                + "— Поди-ка, старуха, по коробу поскреби, по сусеку помети, не наскребешь ли муки на колобок.";
        int choice = 0;
        System.out.println(text);
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Выберите вариант:");
            System.out.println("1. Удалить пробелы.");
            System.out.println("2. Сделать все заглавными или строчными.");
            System.out.println("3. Посчитать количество символов.");
            System.out.println("0. Выход");
            choice = in.nextInt();
            switch (choice){
                case 1:
                    text = text.replaceAll(" ", "");
                    System.out.println(text);
                    break;
                case 2:
                    text = text.toUpperCase();
                    System.out.println(text);
                    break;
                case 3:
                    System.out.println(text.length());
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }
}