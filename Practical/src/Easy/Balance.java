package Easy;

public class Balance {
    private int right = 0;
    private int left = 0;
    void addRight(int n){
        this.right += n;
    }
    void addLeft(int n){
        this.left += n;
    }
    String getSituation(){
        if (this.left == this.right) return "=";
        else if (this.left > this.right) return "L";
        else return "R";
    }
}
