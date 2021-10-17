package Easy;

public class EasyTasks {
    public static void main(String[] args) {
        Balance balance = new Balance();
        balance.addLeft(2);
        balance.addRight(3);
        System.out.println(balance.getSituation());
        balance.addLeft(1);
        System.out.println(balance.getSituation());
    }
}
