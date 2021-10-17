public class Task431 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
           // sb.delete("ABC");
        }
        System.out.println((System.currentTimeMillis() - startTime));
    }
}
