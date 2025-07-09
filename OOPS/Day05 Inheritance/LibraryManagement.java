class Book{
    String title;
    int publicationyear;
    Book(String title,int year){
        this.title=title;
        this.publicationyear=year;
    }
    void display(){
        System.out.println("book title"+title);
        System.out.println("book publication yeAR"+publicationyear);
    }
}
class Author extends Book{
    String name;
    String bio;
    Author(String title,int year,String name,String bio){
        super(title, year);
        this.name=name;
        this.bio=bio;
    }
    @Override
    void display(){
        super.display();
        System.out.println("name of author"+name);
        System.out.println("bio of author "+bio);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
         Author author1=new Author("the hunter", 2024, "andre", "a good person");
         author1.display();
        
    }

   
}
