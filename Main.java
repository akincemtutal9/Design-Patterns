
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        JeweleryFactory jewelaryFactory = new JeweleryFactory();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Jewelery jewelery = null;
        String jeweleryName = null;
        boolean isRun = true;
        String length = "";
        double Length = 0;
        double purity = 0;
        System.out.println("WELCOME TO OUR JEWELERY STORE");
        System.out.println("*****************************");
        System.out.println("Please enjoy while you creating yourself a nice jewelery :)");
        System.out.println("Don't forget you need to add purity for take a price at the end!");
        while (isRun) {            
            System.out.println("Please select a jewelery and state it with given numbers..."
                    + "\n" + "1- Bracelet \n2- Necklace \n3- Ring");
            String choice = scanner.next();
            jewelery = JeweleryFactory.create(choice);
            if (jewelery instanceof Necklace) {
                System.out.println("Enter your necklaces radius in range 7-10 cm: ");
                double radius = scanner.nextDouble();
                if(radius < 7 || radius > 10 ){
                    System.out.println("Please enter in range 7-10");
                }
                else{
                ((Necklace) jewelery).setProperty(radius);
                length = ((Necklace) jewelery).getLength();
                Length = Double.parseDouble(length);
                jeweleryName = "Necklace";
                isRun = false;
                }
            } else if (jewelery instanceof Ring) {
                System.out.println("Enter your rings radius in range of 1-2 cm:");
                double radius = scanner.nextDouble();
                if(radius < 1 || radius > 2 ){
                    System.out.println("Please enter in range 1-2");
                }
                else{
                ((Ring) jewelery).setProperty(radius);
                length = ((Ring) jewelery).getLength();
                Length = Double.parseDouble(length);
                jeweleryName = "Ring";
                isRun = false;
                }
            } else if (jewelery instanceof Bracelet) {
                System.out.println("Enter your bracelets radius in range of 3-5 cm: ");
                double radius = scanner.nextDouble();
                if(radius < 3 || radius > 5 ){
                    System.out.println("Please enter in range 3-5");
                }
                else{
                ((Bracelet) jewelery).setProperty(radius);
                length = ((Bracelet) jewelery).getLength();
                Length = Double.parseDouble(length);
                jeweleryName = "Bracalet";
                isRun = false;
                }
            } else {
                System.out.println("Invalid input. Try again:");
            }
        }

        while (!input.equals("0")) {
            System.out.println("Please select your wantings according to given numbers");
            System.out.println("****************************************************************");
            System.out.println("1: Shape Info  \n2: Add opacity (int) \n3: Add purity (int) \n4: Add brigthness (int) \n0: quit");
            input = scanner.next();
            if (input.equalsIgnoreCase("1")) {
                System.out.println(jewelery.getDetails());
            } else if (input.equalsIgnoreCase("2")) {
                System.out.println("Enter opacity in range of 1-5 :");
                int value = scanner.nextInt();
                if (value > 5 || value < 0) {
                    System.out.println("Please enter in range 1-5");
                } else {
                    jewelery = new Opacity(jewelery);
                    ((Opacity) jewelery).setProperty(value);
                    
                }
            } else if (input.equalsIgnoreCase("3")) {
                System.out.println("Enter purity in range of 14-24 :");
                int value = scanner.nextInt();
                if (value > 24 || value < 14) {
                    System.out.println("Please enter in range 14-24");
                } else {
                    jewelery = new Purity(jewelery);
                    ((Purity) jewelery).setProperty(value);
                    purity = ((Purity) jewelery).getPurity();
                
                }
            } else if (input.equalsIgnoreCase("4")) {
                System.out.println("Enter brigthness in range of 1-5 :");
                int value = scanner.nextInt();
                if (value > 5 || value < 1) {
                    System.out.println("Please enter in range 1-5");
                }
                jewelery = new Brightness(jewelery);
                ((Brightness) jewelery).setProperty(value);
                
            }
        }

        input = "";
        while (!input.equals("0")) {
            System.out.println("Please select the material of your jewelery: ");
            System.out.println("1: Shape Info \n2: Diamond \n3: Silver  \n4: Gold \n0: quit");
            input = scanner.next();

            if (input.equalsIgnoreCase("2")) {
                System.out.println("Price for Diamond " + jeweleryName + " = " + (Length * purity * Materials.DIAMOND));
            } else if (input.equalsIgnoreCase("3")) {
                System.out.println("Price for Silver " + jeweleryName + " = " + (Length * purity * Materials.SILVER));
            } else if (input.equalsIgnoreCase("4")) {
                System.out.println("Price for Gold " + jeweleryName + " = " + (Length * purity * Materials.GOLD));
            } else if (input.equalsIgnoreCase("1")) {
                System.out.println(jewelery.getDetails());
            } else if (input.equalsIgnoreCase("0")) {
                System.out.println("Have a good day!");

            } else {
                System.out.println("Invalid input. Try again:");
                input = "continue";
            }
        }
    }
}
