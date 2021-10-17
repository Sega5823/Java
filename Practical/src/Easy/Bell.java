package Easy;

public class Bell {
    private int i = 0;
    public void sound(){
        if (i == 0) {
            System.out.println("ding");
            i++;
        }
        else {
            System.out.println("dong");
            i--;
        }
    }
}
