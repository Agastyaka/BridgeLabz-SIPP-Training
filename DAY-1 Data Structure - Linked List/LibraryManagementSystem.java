class Book{
    String title;
    String author;
    String genre;
    int bookid;
    boolean isavailable;
    Book next;
    Book prev;
    Book(String title,String author,String genre,int bookid,boolean isavailable){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.bookid=bookid;
        this.isavailable=isavailable;
        this.next=null;
        this.prev=null;
    }
}
class Library{
    private Book head,tail;

    void addatbeggning(Book newBook){
        if(head==null){
            head=tail=newBook;
        }else{
            newBook.next=head;
            head.prev=newBook;
            head=newBook;
        }
    }
    void addatend(Book newBook){
        if(head==null){
            head=tail=newBook;
        }
        else{
            tail.next=newBook;
            newBook.prev=tail;
            tail=newBook;
        }
    }
    void addatspecificpositon(Book newBook,int position){
        if(position<=1){
            addatbeggning(newBook);
        }
        Book temp=head;
        int index=1;
        while (temp!=null && index<position-1) {
            temp=temp.next;
            
        }
        if(temp==null ||temp.next==null){
            addatend(newBook);
        }else{
            newBook.next=temp.next;
            newBook.prev=temp;
            temp.next.prev=newBook;
            temp.next=newBook;

        }
    }
    public void removebyid(int bookid) {
        Book temp = head;

        while (temp != null && temp.bookid != bookid) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found");
            return;
        }

        if (temp == head && temp == tail) {
            head = tail = null;
        } else if (temp == head) {
            head = head.next;
            head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book with ID " + bookid + " removed.");
    }
    public void searchBook(String keyword){
        Book temp=head;
        boolean found=false;
        while (temp!=null) {
            if(temp.title.equalsIgnoreCase(keyword)|| temp.author.equalsIgnoreCase(keyword)){
                printbook(temp);
                found=true;

            }
            temp=temp.next;
        }
        if(!found){
            System.out.println("book is not found");
        }

    }
    public void updateavailability(int id,boolean newstatus){
        Book temp=head;
        while (temp!=null) {
            if(temp.bookid==id){
                temp.isavailable=newstatus;
                System.out.println("staus is updated");
                return;
            }
            temp=temp.next;
            
        }
        System.out.println("book id not found");
    }
    public void displayforward(){
        Book temp=head;
        while (temp!=null) {
            printbook(temp);
            temp=temp.next;
        }

    }
    public void displayreverse(){
        Book temp=tail;
        while (temp!=null) {
            printbook(temp);
            temp=temp.prev;
            
        }
    }
    public int countBook(){
        int count=0;
        Book temp=head;
        while (temp!=null) {
            count++;
            temp=temp.next;
            
        }
        return count;
    }
    
    private void printbook(Book b){
        System.out.println("ID "+b.bookid+" title"+b.title+" Author"+b.author+" genre"+b.genre+" Available"+b.isavailable);
    }

}
public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library lib1=new Library();
        lib1.addatend(new Book("the book1", "author1", "genre1", 1, true));
        lib1.addatbeggning(new Book("book2", "null", "genre1", 2, true));
        lib1.addatspecificpositon(new Book("book3", "auther3", "genre1", 3, true), 2);
        System.out.println("print forward");
        lib1.displayforward();
        System.out.println("reverse print");
        lib1.displayreverse();
        System.out.println("search by title");
        lib1.searchBook("the book1");
        System.out.println("update availability");
        lib1.updateavailability(1, false);
        System.out.println("after update");
        lib1.displayforward();
        System.out.println("total books"+lib1.countBook());
        System.out.println("remove book by id 2");
        lib1.removebyid(2);
        System.out.println("display");
        lib1.displayforward();



    }
}