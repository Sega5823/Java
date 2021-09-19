public class Turtle {
    String name = "";

    public void setName(String n) {
        this.name = n;
    }

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.setName("Arkadiy Ivanovich");
        System.out.println(turtle.name);
    }
}
