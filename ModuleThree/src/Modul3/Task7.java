package Modul3;

import java.util.Scanner;
// Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке. Не используйте второй массив для хранения результатов.

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String[] words = word.split(" ");
        for (int i = 0, o = words.length-1; i < words.length/2; i++, o--){
            String temp = words[i];
            words[i] = words[o];
            words[o] = temp;
        }
        for (String word1 : words) {
            System.out.println(word1);
        }
    }
}
