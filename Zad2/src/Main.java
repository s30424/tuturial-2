import java.time.*;
import java.util.Scanner;

public class Main {
    public static boolean isUnder10(int age) {
        if(age < 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        double price = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give age: ");
        int age = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Give city: ");
        String city = sc2.nextLine();
        System.out.println("Checking current date...");
        String date = LocalDate.now().getDayOfWeek().name();
        int discount = 0;
        if (age < 10) {
            price = 0;
            discount = 100;
        } else if (age < 18) {
            price *= 0.5;
            discount += 50;
            if (city.equals("Warsaw")) {
                price *= 0.1;
                discount += 10;
            }
            if (date.equals("THURSDAY")) {
                price = 0;
                discount = 100;
            }
        }
        System.out.println(date + ": " + city + ", " + age + " years old, weekday Ticket price: " + price + " PLN + " +
                "Discount: " + discount + "%");
    }
}