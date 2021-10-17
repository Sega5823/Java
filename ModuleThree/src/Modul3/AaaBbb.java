package Modul3;

import java.util.Scanner;

public class AaaBbb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String newWord = "";
        int counter = 1;
        for (int i = 0; i < word.length(); i++){
            newWord += (word.charAt(i));
            for (int y = i+1; y < word.length(); y++){
                if (word.charAt(i) == word.charAt(y)) counter++;
                else {
                    i = y-1;
                    break;
                }
            }
            if (counter != 1){
                newWord += counter;
            }
            counter = 1;
        }
        System.out.println(newWord);
    }
}
