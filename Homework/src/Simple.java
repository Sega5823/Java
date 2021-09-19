import static java.lang.Math.sqrt;

public class Simple {
    public static void main(String[] args) {
        //int x = 2;
        for (int x =2; x<101; x++){
            if (Simplenumber(x)) System.out.println(x);
        }
    }
    public static boolean Simplenumber(long n){
            for(long i=2;i<=sqrt(n);i++){
                if (n % i == 0)
                    return false;
        }
            return true;
    }
}
