
import java.util.*;
import java.io.*;

public class menu {
    public static void main(String[] args) {
        System.out.println("welcome to Epicurean Bliss Bistro ");
        Scanner sc = new Scanner(System.in);

        System.out.println("open menu ?");
        System.out.println("yes");
        System.out.println("no");
        System.out.println("Type yes or no");

        String option = sc.next();

        if (option.equalsIgnoreCase("yes")) {
            System.out.println("what would you like to have ?");
            System.out.println("Press 1 for Veg");
            System.out.println("Press 2 for Non-Veg");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("");
            }
        }
    }
}
