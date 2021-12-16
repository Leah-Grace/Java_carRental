import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static int data = 0;
    public static void main(String[] args) {
        System.out.println("Hello Car Renters");
        Cars subaru = new Cars(2011, "Subaru", "Legacy", 1.2, false, 1111);
        Cars volvo = new Cars(2001, "Volvo", "v70", 1.2, false, 22222);
        Cars saab = new Cars(2001, "Saab", "93", 1.2, false, 33333);

        List <Cars> availableCars = new ArrayList(); //Type of list is missing type casting is happening later
        availableCars.add(subaru);
        availableCars.add(volvo);
        availableCars.add(saab);

        List <Cars> bookedCars = new ArrayList();

        System.out.println("Select your preferred car to book: ");
        for (byte i = 0; i < availableCars.size(); i++){
            System.out.print((i + 1) +". ");
            System.out.println(availableCars.get(i).getMake());
        }

        Scanner input = new Scanner(System.in);
        data = input.nextInt(); //Refactor to take interger from Scanner
        data--;

        Cars selectedCar = availableCars.get(data);
        int selectedCarId = selectedCar.getId(); //Prints the id number
        String selectedCarMake = selectedCar.getMake();
        //System.out.println("You have selected the " + selectedCar.getYear() + " " + selectedCarMake + ", with id number: " + selectedCarId);

        for (byte i = 0; i < availableCars.size(); i++){
            if(selectedCar.getId() == availableCars.get(i).getId()){
                bookedCars.add(availableCars.get(i));
                availableCars.remove(availableCars.get(i));
            }
        }
        if (!bookedCars.isEmpty()) {
            System.out.print("Congratulations, we have received your reservation for the ");
            for (Cars car : bookedCars) {
                System.out.println(car.getMake());
            }
        }
        System.out.println("Remaining cars: ");
        for (Cars car : availableCars) {
            System.out.println(car.getMake());
        }









        //create a list of Booked Cars t remove from the list of Cars and add to the list of bookedCars
    }
}
