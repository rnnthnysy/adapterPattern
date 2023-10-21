package adapterPattern;
import java.util.*;
public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet laptopOL = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorOL = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneChargerOL = new SmartphoneAdapter(smartphoneCharger);

        boolean executing = true;
        System.out.println("Device Adapter System for Power Outlet Management");

        while(executing){
            System.out.println("Please choose an Electronic Device: ");
            System.out.println("(1) Laptop");
            System.out.println("(2) Refrigerator");
            System.out.println("(3) Smartphone Charger");
            System.out.println("(4) Exit");
            int choice = sc.nextInt();

            switch(choice){
                case 1 : System.out.println(laptopOL.plugIn()); break;
                case 2 : System.out.println(refrigeratorOL.plugIn()); break;
                case 3 : System.out.println(smartphoneChargerOL.plugIn()); break;
                case 4 : System.out.println("Thank you for using!"); System.exit(0); break;
                default : System.out.println("Invalid Input! Please Try Again"); break;
            }
        }
    }
}