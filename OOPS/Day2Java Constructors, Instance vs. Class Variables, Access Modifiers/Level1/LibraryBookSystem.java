class Book{
    String Author;
    String Book;
    Double Price;
    Boolean Availability;
    Book(String Au, String B, Double P, Boolean A){
        Author=Au;
        Book=B;
        Price=P;
        Availability=A;
    }
    void borrow(){
        if(Availability){
            Availability=false;
            System.out.println("book is borrkowed"+Book);
            
        }
        else{
            System.out.println("the book "+Book+" is not available");

        }

    }
    void display(){
        System.out.println("name of author.  "+Author);
        System.out.println("name of Book  "+Book);
        System.out.println("price of Book"+Price);
        if(Availability){
            System.out.println("book is available");
        }
        else
        System.out.println("book is not available");
    }
    



    
}

public class LibraryBookSystem {
    public static void main(String[] args) {
        Book book1=new Book("james clear", "Atomic habit", 259.0, true);
        book1.display();
        book1.borrow();
        book1.display();
        book1.borrow();
        System.out.println(book1);


        
         

        
        
    }

    
}