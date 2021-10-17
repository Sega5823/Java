package Modul3;

import java.util.Scanner;
//Используя методы для строк и массивов, напишите свой метод для переворачивания слова наоборот. Он должен работать только для одного слова.
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String[] words = word.split(" ");
        do {
            if (words.length!=1) {
                System.out.println("Введите корректное Имя");
                word = in.nextLine();
                words = word.split(" ");
                continue;
            }
        } while (words.length!=1);
        String drow = "";
        for (int i = word.length() - 1; i!=-1; i--){
            drow += word.charAt(i);
        }
        System.out.println(drow);
    }
}
