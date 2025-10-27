package assignmentfive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input in CSV format
        String bookingDetails = sc.nextLine();
        String[] details = bookingDetails.split(",");

        String stageEvent = details[0];
        String customer = details[1];
        Integer noOfSeats = Integer.parseInt(details[2]);

        // Create TicketBooking object
        TicketBooking tb = new TicketBooking(stageEvent, customer, noOfSeats);

        // Read payment mode
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        tb.displayBookingDetails();

        switch (choice) {
            case 1:
                double cashAmount = sc.nextDouble();
                tb.makePayment(cashAmount);
                break;

            case 2:
                double walletAmount = sc.nextDouble();
                sc.nextLine();
                String walletNumber = sc.nextLine();
                tb.makePayment(walletAmount, walletNumber);
                break;

            case 3:
                String holderName = sc.nextLine();
                double cardAmount = sc.nextDouble();
                sc.nextLine();
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                tb.makePayment(holderName, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}