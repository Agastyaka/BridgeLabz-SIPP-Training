

class bookandling {
String title;
String author;
double Price;
//paramethasis construstor
bookandling(String title,String author, double Price){
    this.title=title;
    this.author=author;
    this.Price=Price;
}
//default construtor
bookandling(){
     title="helo";
     author="gasto";
     Price=234;
}
public void diplay(){
    System.out.println("book title"+title);
    System.out.println("book author"+author);
    System.out.println("book price"+Price);
}
}
public class BookHandling {
    public static void main(String[] args) {
        bookandling book1=new bookandling("atomic habit", "james clear", 200);
        book1.diplay();
        bookandling book2=new bookandling();
        book2.diplay();

        
    }

    
}