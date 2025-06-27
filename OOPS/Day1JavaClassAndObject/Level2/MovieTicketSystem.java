class MovieTicket{
    String Moviename;
    int seatno;
    double price;
    MovieTicket(String movie,int no,double pric){
        Moviename=movie;
         seatno=no;
         price=pric;
    }
    public void BookaTicket(){
        System.out.println("the thicket is booked"+Moviename);

    }
    public void displaymoviedetail(){
        System.out.println("movie name"+Moviename);
        System.out.println("seat no"+seatno);
        System.out.println("movie price"+price);

    }
}

public class MovieTicketSystem {
    public static void main(String[] args) {
        MovieTicket movie1=new MovieTicket("Howl", 22, 345);
        MovieTicket movie2=new MovieTicket("venom", 23, 456);
        movie1.BookaTicket();
        movie1.displaymoviedetail();
        movie2.BookaTicket();
        movie2.displaymoviedetail();

    }

    
}