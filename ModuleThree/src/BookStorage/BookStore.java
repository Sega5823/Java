package BookStorage;

public class BookStore {
    public static void main(String[] args) {
        Book[] Booklist = new Book[2];
        for (int z = 0; z < Booklist.length; z++) {
            Book newBook = new Book();
            newBook.createBook();
            Boolean inBooklist = false;

            for (int i = 0; i < z; i++) {
                if (newBook.Book1Book2(Booklist[i])) {
                    inBooklist = true;
                    break;
                }
                inBooklist = false;
            }
            if (!inBooklist) Booklist[z] = newBook;
            else z--;
        }
        System.out.println("Картотека заполнена!");
//        for (int z = 0; z < Booklist.length; z++) {
//            System.out.printf("Книга №%d: название: %s, год издания: %dг., цена - %dusd", z+1, Booklist[z].name, Booklist[z].year, Booklist[z].price);
//            System.out.println();
//        }
        Book.showBooks(Booklist);
    }
}
