package BookStore;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class Book {
    private String name;
    private int price;
    private int year;

    protected boolean Book1Book2(@NotNull Book booke) {
        if (this.name.equals(booke.name) &&
                this.year == booke.year &&
                this.price == booke.price) return true;
        else return false;
    }

    protected void createBook() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        this.name = in.nextLine();
        System.out.print("Введите цену книги: ");
        this.price = in.nextInt();
        System.out.print("Введите год книги: ");
        this.year = in.nextInt();
        in.nextLine();
    }

    protected static void showBooks(Book[] Booklist) {
        for (int z = 0; z < Booklist.length; z++) {
            System.out.printf("Книга №%d: название: \"%s\", год издания: %dг., цена - %dusd", z + 1, Booklist[z].name, Booklist[z].year, Booklist[z].price);
            System.out.println();
        }
    }
}