class book{
    String book;
    String author;
    double price;
    book(String b,String a,double p){
        book=b;
        author=a;
        price=p;
    }
    void displaydetails(){
        System.out.println("book name:"+book);
        System.out.println("book author:"+author);
        System.out.println("Book price"+price);
    }
}

public class HandleBook {
    public static void main(String[] args) {
        book book1=new book("thery of everything", "mk demarko", 200);
        book book2=new book("power of law", "robert", 300);
        book1.displaydetails();
        book2.displaydetails();
    }

    
}