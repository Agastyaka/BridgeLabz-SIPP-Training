class MovieNode{
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;
    MovieNode(String title,String director,int year,double rating){
        this.title=title;
        this.director=director;
        this.year=year;
        this.rating=rating;
        this.next=null;
        this.prev=null;
    }

}
class MovieManagement{
    private MovieNode head;
    private MovieNode tail;
    MovieManagement(){
        head=null;
        tail=null;
    }
    public void addatbeggning(String title,String director,int year,double rating){
        MovieNode node1=new MovieNode(title, director, year, rating);
        if(head==null){
            head=tail=node1;
        }
        else{
            node1.next=head;
            head.prev=node1;
            head=node1;
        }
    }
    public void addatend(String title,String director,int year,double rating){
        MovieNode node2=new MovieNode(title, director, year, rating);
        if(tail==null){
            head=tail=node2;
        }
        else{
            tail.next=node2;
            node2.prev=tail;
            tail=node2;
        }
    }
    public void atspecificposition(String title,String director,int year,double rating,int position){
        if(position==1){
            addatbeggning(title, director, year, rating);
            return;
        }
        MovieNode node3=new MovieNode(title, director, year, rating);
        MovieNode temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("position out of range");
            return;
        }
        node3.next=temp.next;
        node3.prev=temp;
        if(temp.next!=null){
            temp.next.prev=node3;
        }
        else{
            tail=node3;
        }
        temp.next=node3;

    }
  public void removeByTitle(String title) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    MovieNode temp = head;

    while (temp != null && !temp.title.equalsIgnoreCase(title)) {
        temp = temp.next;
    }

    if (temp == null) {
        System.out.println("Movie not found: " + title);
        return;
    }

    if (temp == head) {
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // list became empty
        }
    } else if (temp == tail) {
        tail = tail.prev;
        tail.next = null;
    } else {
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    System.out.println("Movie removed: " + title);
}

public void searchByDirector(String director) {
    MovieNode temp = head;

    while (temp != null) {
        if (temp.director.equalsIgnoreCase(director)) {
            System.out.println("movie found");
            printMovie(temp);
            return; 
        }
        temp = temp.next;
    }

    
    System.out.println("Movie not found.");
}


    public void searchbyrating(double ratingg){
        MovieNode temp=head;
        while(temp !=null){
            if(temp.rating==ratingg){
                System.out.println("movie found");
                printMovie(temp);
                return;
            }
            temp=temp.next;
        }
        System.out.println("movie not found");
    }
    public void updaterating(String title,double newrating){
        MovieNode temp=head;
        while (temp!=null) {
            if(temp.title.equalsIgnoreCase(title)){
                temp.rating=newrating;
                System.out.println("movie rating updated"+title);
                return;
            }
            temp=temp.next;
            
        }
        System.out.println("movie not found");
    }
    public void displayforward(){
        System.out.println("printforward");
        MovieNode temp=head;
        while(temp !=null){
            printMovie(temp);
            temp=temp.next;
        }
    }
    public void displaybackwaard(){
        System.out.println("print backward");
        MovieNode temp=tail;
        while (temp !=null) {
            printMovie(temp);
            temp=temp.prev;
            
        }
    }
    private void printMovie(MovieNode movie) {
    System.out.println("Title: " + movie.title + ", Director: " + movie.director +  ", Year: " + movie.year + ", Rating: " + movie.rating);
}

}
public class MovieManagementSystem {

    public static void main(String[] args) {
        MovieManagement movies=new MovieManagement();
        movies.addatend("hae", "ruf", 2004, 4);
        movies.addatbeggning("hello", "huf", 2006, 3);
        movies.atspecificposition("helper", "run", 2001, 2, 2);
        movies.displayforward();
        movies.displaybackwaard();
        movies.searchByDirector("run");
        movies.searchbyrating(4);
        movies.updaterating("hae", 8);
        movies.displayforward();
        movies.removeByTitle("helper");
        movies.displayforward();
    }
}
