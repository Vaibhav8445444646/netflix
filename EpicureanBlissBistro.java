
import java.util.Scanner;

public class EpicureanBlissBistro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Epicurean Bliss Bistro");

        System.out.println(
                "Excuse me Sir/ Ma'am are you ready to order right now, or would you like a few more minutes with the menu?");

        System.out.println("STARTERS");
        System.out.println("would you like to have veg starter or non-veg?");
        System.out.println("enter 1 for veg and 2 for non veg");

        int s = sc.nextInt();
        if (s == 1) {
            System.out.println("Here are some veg starters:");
            System.out.println("Honey chilli potato -> 60");
            System.out.println("Spring rolls -> 40");
            System.out.println("paneer tikka -> 150");
            System.out.println("veg taco -> 80");
            System.out.println("fried corns -> 180");
            System.out.println("veg kabab -> 40");
            System.out.println("paneer 65 -> 120");

        } else if (s == 2) {
            System.out.println("chilli chicken -> 220");
            System.out.println("chicken taco -> 120");
            System.out.println("fried shripm -> 180");
            System.out.println("chicken kabab -> 80");
            System.out.println("chicken 65 -> 120");
            System.out.println("chicken tikka -> 249");
            System.out.println("chicken lollipo -> 269");
            System.out.println("chicken spring -> 80");
        }

        else
            System.out.println(
                    "okay sir if you are looking for main course or beverages with this here are some options you can have ");

        System.out.println("ANYTHING IN MAIN COURSE BOR WOULD YOU LIKE TO ORDER IT AFTER SOMETIMES");
    }
}
