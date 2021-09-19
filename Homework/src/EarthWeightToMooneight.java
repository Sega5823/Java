import java.util.Scanner;

class EarthWeightToMoonWeight {
    public static void main(String args[]){
        double weight, Moon_weight;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш вес: ");
        weight = in.nextInt();

        Moon_weight = weight * 0.17;
        System.out.println("Ваш вес на луне составил бы " + Moon_weight);

    }
}
