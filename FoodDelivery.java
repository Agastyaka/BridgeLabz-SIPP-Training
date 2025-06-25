    class resturant{
    String name;
    String location;
    String[] foodItems;
    public resturant(String n,String l,String [] f){
        name=n;
        location=l;
        foodItems=f;
    }
    public void resturantdetail(){
        System.out.println("restaurant name: "+name);
        System.out.println("restaurant loaction: "+loaction);
        System.out.println("food items: ");
        for(int i=0;i<=foodItems.length-1;i++){
            System.out.println(foodItems[i]);
        }
    }
    public boolean foodavailable(String food){
        for(String item : foodItems){
              if (item.equalsIgnoreCase(food)) {
                return true;

        }
        return false;
    }

}
public class FoodDelivery{
    public static void main(String [] args){
    String [] fooditem1={"Pizza", "Pasta", "Burger"};
    String []fooditem2={"sushi","ramen","momos"};
    restaurant.restaurant1=new restaurant("italien","downtown",fooditem1);
    restaurant.restaurant2=new restaurant("chinese","binzin",fooditem2);
    restaurant1.resturantdetail();
    restaurant2.resturantdetail();
}
}
