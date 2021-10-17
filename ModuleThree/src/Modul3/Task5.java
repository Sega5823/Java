package Modul3;

public class Task5 {
    public static void main(String[] args) {
        double [] arr = {1.3, 3.2, 5.1, 4.7};
        double sum = 0, max = arr[0];

        for (double i : arr){
            System.out.println(i);
            sum += i;
            if (max < i) max = i;
        }
        System.out.println("Сумма всех чисел массива: " + sum);
        System.out.println("Наибольший элемент: " + max);
    }
}
