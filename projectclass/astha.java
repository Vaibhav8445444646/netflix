import java.util.Scanner;

public class astha {
    private int totalBill = 0;
    private StringBuilder order = new StringBuilder();

    public void displayMenu1() {
        System.out.println("MAIN MENU OF VEG");
        System.out.println("1. 1 Dal Makhani + 2 Roti - 200 rs.");
        System.out.println("2. 1 Chilli panner + 2 Roti - 250 Rs.");
        System.out.println("3. 1  Bowl Rice - 50 Rs.");
        System.out.println("4. Total Billing");
        System.out.println("5. Exit");
    }

    public void displayMenu2() {
        System.out.println("MAIN MENU OF NON VEG");
        System.out.println("1. 1 Butter chicken + 2 Roti - 400 Rs.");
        System.out.println("2. 1 chicken curry + 2 Roti - 350 Rs.");
        System.out.println("3. 1 Non veg Briyani - 100 Rs.");
        System.out.println("4. Total Billing");
        System.out.println("5. Exit");
    }

    public void displayMenu3() {
        System.out.println("MAIN MENU OF NON VEG");
        System.out.println("1. 1 chicken momos - 150 Rs.");
        System.out.println("2. 1 chicken spring roll - 100 Rs.");
        System.out.println("3. 1 chicken pakoda - 180 Rs.");
        System.out.println("4. Total Billing");
        System.out.println("5. Exit");
    }

    public void displayMenu4() {
        System.out.println("MAIN MENU OF NON VEG");
        System.out.println("1. 1 chilli potato- 80 Rs.");
        System.out.println("2. 1 kabab  - 50 Rs.");
        System.out.println("3. 1 momos - 80 Rs.");
        System.out.println("4. Total Billing");
        System.out.println("5. Exit");
    }

    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for veg ");
        System.out.println("Press 2 for Non veg");
        int s = scanner.nextInt();
        while (true) {
            if (s == 1) {
                System.out.println("press 1 for starter");
                System.out.println("press 2 for main course");
                int a = scanner.nextInt();
                while (true) {
                    if (a == 1) {
                        displayMenu4();
                        System.out.print("Enter your choice (1-5): ");
                        int choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                order.append("1 chilli potato\n");
                                totalBill += 80;
                                System.out.println("1 chilli potato added to your order.");
                                break;
                            case 2:
                                order.append("1 kabab\n");
                                totalBill += 50;
                                System.out.println("1 kabab added to your order.");
                                break;
                            case 3:
                                order.append("1 momos \n");
                                totalBill += 80;
                                System.out.println("1 momos added to your order.");
                                break;
                            case 4:
                                printBill();
                                return;
                            case 5:
                                return;
                            default:
                                System.out.println("Go Home Have a Nice Day");
                                return;
                        }
                    } else {
                        displayMenu1();
                        System.out.print("Enter your choice (1-5): ");
                        int choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                order.append("1 Dal Makhani + 2 Roti\n");
                                totalBill += 200;
                                System.out.println("1 Dal Makhani + 2 Roti added to your order.");
                                break;
                            case 2:
                                order.append("1 Chilli panner + 2 Roti\n");
                                totalBill += 250;
                                System.out.println("1 Chilli panner + 2 Roti added to your order.");
                                break;
                            case 3:
                                order.append("1  Bowl Rice \n");
                                totalBill += 50;
                                System.out.println("1  Bowl Rice  added to your order.");
                                break;
                            case 4:
                                printBill();
                                return;
                            case 5:
                                return;
                            default:
                                System.out.println("Go Home Have a Nice Day");
                                return;
                        }
                    }
                }
            } else {
                System.out.println("press 1 for starter");
                System.out.println("press 2 for main course");
                int a = scanner.nextInt();
                while (true) {
                    if (a == 1) {
                        displayMenu3();
                        System.out.print("Enter your choice (1-5): ");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                order.append("1 chicken momos + 2 Roti\n");
                                totalBill += 150;
                                System.out.println("1 chicken momos added to your order.");
                                break;
                            case 2:
                                order.append("1 chicken spring roll\n");
                                totalBill += 100;
                                System.out.println("1 chicken spring roll to your order.");
                                break;
                            case 3:
                                order.append("1 chicken pakoda\n");
                                totalBill += 180;
                                System.out.println("1 chicken pakoda added to your order.");
                                break;
                            case 4:
                                printBill();
                                return;
                            case 5:
                                return;
                            default:
                                System.out.println("Go Home Have a Nice Day");
                                return;
                        }
                    } else {
                        displayMenu2();
                        System.out.print("Enter your choice (1-5): ");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                order.append("1 Butter chicken + 2 Roti\n");
                                totalBill += 400;
                                System.out.println("1 Butter chicken + 2 Roti added to your order.");
                                break;
                            case 2:
                                order.append("1 chicken curry + 2 Roti\n");
                                totalBill += 350;
                                System.out.println("1 chicken curry + 2 Roti added to your order.");
                                break;
                            case 3:
                                order.append("1 Non veg Briyani\n");
                                totalBill += 100;
                                System.out.println("1 Non veg Briyani added to your order.");
                                break;
                            case 4:
                                printBill();
                                return;
                            case 5:
                                return;
                            default:
                                System.out.println("Go Home Have a Nice Day");
                                return;
                        }
                    }
                }
            }
        }
    }

    private void printBill() {
        System.out.println("\nBILL:");
        System.out.println(order.toString() + "Total Bill: " + totalBill + " Rs.\n");
    }

    public static void main(String[] args) {
        astha orderSystem = new astha();
        orderSystem.takeOrder();
        System.out.println("Thankyou for your visit");
    }
}