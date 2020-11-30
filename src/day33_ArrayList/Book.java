package day33_ArrayList;

public class Book {

    public String name;
    public String author;
    public boolean isEnglish;

    public Book( String name, String author, boolean isEnglish ) {

        this.name = name;
        this.author = author;
        this.isEnglish = isEnglish;

    }


    public void bookInfo( ){
        System.out.println("Book name: " + name + "\nAuthor: " + author + "\nIs English: " + isEnglish);
    }


}
