
import java.util.Scanner;

public class CabBooking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        sc.nextLine();

        String passengerName = sc.nextLine();

        CabBooking cb = null;

        if (choice == 1) {
            cb = new CabBooking(passengerName);
        } else if (choice == 2) {
            String cabType = sc.nextLine();
            int distance = sc.nextInt();

            cb = new CabBooking(passengerName, cabType, distance);
        }

        cb.displayBooking();
    }
}

class CabBookingMain {

    String passengerName;
    String cabType;
    int distance;
    int fare;

    // Quick Booking
    CabBooking(String passengerName) {
        this.passengerName = passengerName;
        this.cabType = "Mini";
        this.distance = 5;
        this.fare = 75;
    }

    CabBooking(String passengerName, String cabType, int distance) {
        this.passengerName = passengerName;
        this.cabType = cabType;
        this.distance = distance;
        this.fare = distance * 15;
    }

    void displayBooking() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs. " + fare);
    }
}
