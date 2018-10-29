import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Building b;
    static Vehicle v;
    static Food f;
    static Waste w;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option = -1;
        int option2 = -1;

        System.out.println("Hello!");
        System.out.println("We are here to calculate your carbon footprint. Please answer following questions. (enter numbers)");

        System.out.println("############################################");

        System.out.println("What kind of house you live in?");
        System.out.println("1. Large");
        System.out.println("2. Medium");
        System.out.println("3. Small");
        System.out.println("4. Apartment");

        option = in.nextInt();

        if(option == 1) b = new Building("large");
        if(option == 2) b = new Building("medium");
        if(option == 3) b = new Building("small");
        if(option == 4) b = new Building("apartment");

        System.out.println("############################################");

        System.out.println("How many miles you drive annually?");
        System.out.println("1. More than 15000");
        System.out.println("2. More than 10000 and less than 15000");
        System.out.println("3. More than 1000 and less than 10000");
        System.out.println("4. Less than 1000");
        System.out.println("5. I don't have a vehicle");

        option = in.nextInt();

        v = new Vehicle(option);

        System.out.println("############################################");

        System.out.println("What is your eating habit?");
        System.out.println("1. I consume meat daily");
        System.out.println("2. I consume meat few times a week");
        System.out.println("3. I am a vegetarian");
        System.out.println("4. I am a vegan");

        option = in.nextInt();

        System.out.println("Do you prefer packaged food?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        option2 = in.nextInt();
        Boolean isPackaged = false;
        if(option2 == 1) isPackaged = true;

        if(option == 1) f = new Food("dailymeat", isPackaged);
        if(option == 2) f = new Food("fewtimesmeat", isPackaged);
        if(option == 3) f = new Food("vegetarian", isPackaged);
        if(option == 4) f = new Food("vegan", isPackaged);

        System.out.println("############################################");

        System.out.println("How many of the following items you recycle, Plastic, Paper and Aluminium?");
        System.out.println("1. All of them");
        System.out.println("2. Two of them");
        System.out.println("3. One of them");
        System.out.println("4. None");

        option2 = in.nextInt();

        if(option == 1) w = new Waste("all");
        if(option == 2) w = new Waste("one");
        if(option == 3) w = new Waste("two");
        if(option == 4) w = new Waste("none");

        System.out.println("############################################");

        ArrayList<CarbonFootPrint> allTypes = new ArrayList<>();
        allTypes.add(b);
        allTypes.add(f);
        allTypes.add(v);
        allTypes.add(w);

        int totalCarbonFootPrint = 0;
        for(CarbonFootPrint cfp: allTypes){
            totalCarbonFootPrint+= cfp.getCarbonFootPrint();
        }

        if(totalCarbonFootPrint >= 50){
            System.out.println("Your carbon footprint is "+ totalCarbonFootPrint+". Which is very high.");
        } else {
            System.out.println("Your carbon footprint is "+ totalCarbonFootPrint+". Which is a good thing, but you can still improve and save nature.");
        }

    }
}
