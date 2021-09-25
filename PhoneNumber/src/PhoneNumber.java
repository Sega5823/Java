import java.util.Arrays;
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        String[] replacement = {"(", ")", " ", "+"};
        deleteSybmols(number, replacement);
        if (isCorrect(number)) {
            number = formatNumber(number);
            System.out.println(number);
        } else {
            System.out.println("Некорректный ввод");
        }

    }

    private static boolean isCorrect(String number) {
        if (number.length() == 11) return true;
        else return false;
    }

    private static void deleteSybmols(String number, String[] replacement) {
        for (String sybmol : replacement) {
            number = number.replaceAll(sybmol, "");
        }
    }

    private static String formatNumber(String number) {
        //Преобразуме в массив
        //String[] arrNumber = number.split("");
        //char
//        for (int i = 0; i < arrNumber.length; i++) {
//            if (i == 0) arrNumber[i] = "+7 ";
//            if (i == 3 || i == 6 || i == 8 || i == 10) arrNumber[i] = arrNumber[i] + " ";
//        }
//        return Arrays.toString(arrNumber);
        return null;
    }
}
