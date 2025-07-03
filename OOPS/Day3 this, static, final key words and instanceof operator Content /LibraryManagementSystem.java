class book{
    static String libraryname="library of hogwarts";
    public static void displaylibraryname(){
        System.out.println("library name is"+libraryname);
    }
    String booktitle;
    String bookauthor;
    final int isbn;
    book(String booktitle,String bookauthor,int isbn){
        this.booktitle=booktitle;
        this.bookauthor=bookauthor;
        this.isbn=isbn;
    }
    public void display(){
        System.out.println("book name"+booktitle);
        System.out.println("book author"+bookauthor);
        System.out.println("isbn"+isbn);
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {
        book.displaylibraryname();
        book book1=new book("power of law", "robert", 5678);
        if(book1 instanceof book){
            System.out.println("book 1 isntance of book");
            book1.display();
        }
        
    }
}