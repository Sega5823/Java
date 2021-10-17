package Average;

public class Programmer {
    String name;
    String company;
    String position;

    public String getPosition() {
        return position;
    }

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    protected void work() {
        switch (this.position) {
            case "intern":
                this.position = "junior";
                break;
            case "junior":
                this.position = "middle";
                break;
            case "middle":
                this.position = "senior";
                break;
            case "senior":
                this.position = "lead";
                break;
            default:
                break;
        }
    }
}
