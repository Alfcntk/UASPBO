/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Administrator
 */
public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getBookInfo() {
        return "Judul: " + title + ", Penulis: " + author + ", Tahun: " + year;
    }

    public static void main(String[] args) {
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        String bookInfo = myBook.getBookInfo();
        System.out.println(bookInfo);
    }
}
