class Icecream{
    String icecreamflavour;
    int sold;
    Icecream(String icecreamflavour,int sold){
        this.icecreamflavour=icecreamflavour;
        this.sold=sold;
    }
    
}
public class IceCreamRush {
   

    public static void main(String[] args) {
        Icecream [] icecreams= new Icecream[8];
        icecreams[0]=new Icecream("choclate", 220);
        icecreams[1]=new Icecream("vanilla", 201);
        icecreams[2]=new Icecream("caremel", 50);
        icecreams[3]=new Icecream("belgiun", 132);
        icecreams[4]=new Icecream("hazelnul", 200);
        icecreams[5]=new Icecream("kasata", 55);
        icecreams[6]=new Icecream("blueberry", 40);
        icecreams[7]=new Icecream("buttersctch", 230);
        for (int i = 0; i < icecreams.length - 1; i++) {
        for (int j = 0; j < icecreams.length - i - 1; j++) {
            if (icecreams[j].sold > icecreams[j + 1].sold) {
                
                Icecream temp = icecreams[j];
                icecreams[j] = icecreams[j + 1];
                icecreams[j + 1] = temp;
            }
        }
    }
        System.out.println("ice cream sales in sort manner");

        for(int i=0;i<=icecreams.length-1;i++){
            System.out.println("amount of "+icecreams[i].icecreamflavour+" sales is   :"+icecreams[i].sold);
        }
        

        
    }
}