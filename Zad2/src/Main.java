import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price = 40;

        Scanner sc = new Scanner(System.in);
        System.out.println("Give age: ");
        int age = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Give city: ");
        String city = sc2.nextLine();

        System.out.println("Checking current date...");
        LocalDate date = LocalDate.now();
        String dayOfTheWeek = date.getDayOfWeek().name();

        int discount = 0;

        if (age < 10) {
            discount = 100;
        } else if (age < 18) {
            discount += 50;
        }
        if (city.equals("Warsaw")) {
            discount += 10;
        }
        if (dayOfTheWeek.equals("THURSDAY")) {
            discount = 100;
        }

        price -= (price * discount * 0.01);

        System.out.println(date + ": " + city + ", " + age + " years old, " + dayOfTheWeek + " Ticket price: " + price +
                " PLN " + "Discount: " + discount + "%");
    }
}