public class Guess {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, answer = 'K', ignore;

        System.out.println("Задумана буква из диапазона A-Z.\tПопытайтесь ее угадать:\t");
        do {
            ch = (char) System.in.read();

            //Отбрасывание всех остальных символов во входном буфере
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) {
                System.out.println("Правильно!");
                break;
            } else {
                System.out.println("Неправильно! Попробуйте еще раз.\t");
            }
        } while (ch != answer);
    }
}
