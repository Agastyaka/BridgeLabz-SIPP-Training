class Book{
    public String ISBN;
    protected String Title;
    private String author;  
    Book(String ISBN,String Title,String author){
        this.ISBN=ISBN;
        this.Title=Title;
        this.author=author;
    }
    public String changeauthor(String newauthor){
        author=newauthor;
        return author;
    }
    void dispaly(){
        System.out.println("Isbn"+ISBN);
        System.out.println("title of book"+Title);
        System.out.println("author of book"+author);
    }

}
class Ebook extends Book{
    Ebook(String ISBN,String Title,String author){
        super(ISBN, Title, author);
    }

}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Book book1=new Book("asdf", "hello java", "anderw");
    book1.dispaly();
    book1.changeauthor("tate");
    book1.dispaly();
    Ebook ebook1=new Ebook("asdfasf", "power", "hdf");
    ebook1.dispaly();

        
    }
    

    
}