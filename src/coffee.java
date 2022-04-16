import java.util.Scanner;

public class coffee {
    public static void main(String[] args) {
        final String START_MESSAGE ="There are 4 coffees to choose from. Which one do you want?\n" +
                "press 1 if you want Espresso\n" +
                "press 2 if you want Americano\n" +
                "press 3 if you want Capuchino\n" +
                "press 4 if you want Latte";
        final String ESPRESSO = "Espresso";
        final String AMERICANO = "Americano";
        final String CAPPUCCINO = "Capuchino";
        final String LATTE = "Latte";
         double milk  = 1000;
         double beans  =  400;
         double water = 3000;
         double sugar = 200;
        int number;
        Scanner first = new Scanner(System.in);
        System.out.println(START_MESSAGE);
        number = first.nextInt();
        if (number == 1) {
            System.out.println("preparation of Espresso");
            water -= 20;
            beans -= 4;
        }
        else if (number == 2) {
            System.out.println("preparation of Americano");
            water -= 50;
            beans -= 4;
        }
        else if (number == 3) {
            System.out.println("preparation of Capuchino");
            water -= 90;
            beans -= 4;
            milk -= 40;
        }
        else if (number == 4){
            System.out.println("preparation of Latte");
            water -= 100;
            beans -= 5;
            milk -= 50;
        }
        else {
            System.out.println("error");
        }
        String finalMessage = "\nwater = "+ water + "\nbeans = "+ beans + "\nmilk = " + milk + "\nsugar = " +sugar;
        System.out.println(finalMessage);


    }
}
