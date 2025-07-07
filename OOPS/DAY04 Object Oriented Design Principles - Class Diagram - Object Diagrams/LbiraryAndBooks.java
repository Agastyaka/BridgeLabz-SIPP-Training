import java.util.*;


class book{
    String title;
    String author;
    book(String title,String author){
        this.title=title;
        this.author=author;
    }
    void display(){ 
        System.out.println("book title"+title+"author name"+author);
    }
}
class library{
    String name;
    ArrayList <book> books;

    library(String name){
        this.name=name;
        books=new ArrayList<>();
    }
    void addbook(book b){
        books.add(b);

    }
    void showbook(){
        System.out.println("library name"+name);
        for(book b:books){
            b.display();
        }
    }
}
public class LbiraryAndBooks {
    public static void main(String[] args) {
        book b1=new book("helo", "java");
        book b2=new book("power", "asdf");
        book b3=new book("hunt","carm");
        library l1=new library("central");
        library l2=new library("departmental");
        l1.addbook(b3);
        l1.addbook(b1);
        l2.addbook(b3);
        l2.addbook(b2);
        l1.showbook();
        System.out.println();
        l2.showbook();
    }

    
}