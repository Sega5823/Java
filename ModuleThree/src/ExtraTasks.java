import BookStorage.BookStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExtraTasks {

    public static void main(String[] args) {
        //firstTask();

        //NameAndPassword();
        String [] a = {"A"};

        BookStore.main(a);
    }

    // Задача 1
    public static void firstTask(){
        int[] array = {5, 24, 3, 66, 38, 16, 27};
        Arrays.sort(array);
        System.out.println(array[2]);
    }

    // Задача 2
    public static void NameAndPassword() {
        int i = 1;
        System.out.println("Введите имя и пароль");
        do {
            Scanner in = new Scanner(System.in);
            String nameAndPassword = in.nextLine();
            String[] arrNAP = nameAndPassword.split(" ");
            if (arrNAP.length != 2) {
                System.out.println("Введите имя и пароль");
                continue;
            }
            do {
                if (arrNAP[1].length() < 8) {
                    System.out.println("Введите пароль заного, тк пароль меньше 8 символов");
                    arrNAP[1] = in.nextLine();
                    continue;
                } else if (arrNAP[1].length() > 15) {
                    System.out.println("Введите пароль заного, тк пароль больше 15 символов");
                    arrNAP[1] = in.nextLine();
                    continue;
                } else {
                    System.out.println(Arrays.toString(arrNAP));
                    i = 0;
                }
            } while (i == 1);
        } while (i == 1);

    }

    public static void Task3() {
        ArrayList[][] namesAndPoints = new ArrayList[5][5];

    }
}
