import java.util.Scanner;

public class BombersHideout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // setting up new passcode
        System.out.println("What is the passcode?:");
        String passcode = scan.nextLine();
        while (true) {
            // the menu
            System.out.println("[enter], [change] passcode, [quit] ");
            String input = scan.nextLine();
            if (input.toLowerCase().equals("enter")) {
                System.out.println("What is the passcode?:");
                String response = scan.nextLine();
                if (response.toLowerCase().equals(passcode)) {
                    System.out.println("You can enter.");
                } else {
                    System.out.println("Wrong passcode.");
                }
            } else if (input.toLowerCase().equals("change")) {
                System.out.println("What is the passcode?:");
                String response = scan.nextLine();
                if (response.toLowerCase().equals(passcode)) {
                    System.out.println("What should the new password be?");
                    String newPasscode = scan.nextLine();
                    passcode = newPasscode;
                } else {
                    System.out.println("Wrong passcode.");
                }
            } else if (input.toLowerCase().equals("quit")) {
                scan.close();
                break;
            } else {
                continue;
            }
        }
    }
}