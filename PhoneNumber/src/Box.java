public class Box implements Cloneable {

    Item item = new Item(3);

    public Box(Item item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Item item;



        Box box = new Box();
        Box clone = box.clone();
        System.out.println(box);
        System.out.println(clone);
    }

    public Box clone(){
        try {
            return (Box) super.clone();
            clone().item = this.item.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}

class Item implements Cloneable {
    int size;

    public Item(int size){
        this.size = size;
    }
}