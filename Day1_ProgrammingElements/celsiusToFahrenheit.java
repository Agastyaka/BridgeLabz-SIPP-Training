import java.util.Scanner;
public class celsiusToFahrenheit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter temprature in celsius");
        float temp = scanner.nextFloat();
        float convertedTemp = (temp*9/5)+32;
        System.out.println("tempurature in Fahrenheit:"+convertedTemp);
    }

}