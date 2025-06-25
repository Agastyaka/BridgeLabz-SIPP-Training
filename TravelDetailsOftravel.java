class TravelDetails{
    String Fromcity;
    String Tocity;
    double distance;
    TravelDetails(String F,String T,double D){
        Fromcity=F;
        Tocity=T;
        distance=D;
    }
    void displayDetails(){
        System.out.println("Traveling From :"+ Fromcity+"Traveling to :"+Tocity+"distance :"+distance);

    }
}
public class TravelDetailsOftravel{
    public static void main (String [] args){
        TravelDetails detail=new TravelDetails("DELHI","GOA",2001.2);
        // detail.Fromcity="delhi";
        // detail.Tocity="gujrat";
        // detail.distance=1500;
        detail.displayDetails();
    }
}