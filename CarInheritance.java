import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class WagonR extends Car {
    private String carMileage;

    public WagonR(int carMileage) {
        super(false, "4");
        this.carMileage = carMileage + " kmpl";
    }

    @Override
    String getMileage() {
        return this.carMileage;

    }


}
class HondaCity extends Car {
    private String carMileage;
    public HondaCity(int carMileage) {
        super(true, "4");
        this.carMileage = carMileage + " kmpl";
    }

    String getMileage() {
        return this.carMileage;

    }


}

class InnovaCrysta extends Car {
    private String carMileage;

    public InnovaCrysta(int carMileage) {
        super(false, "6");
        this.carMileage = carMileage + " kmpl";
    }

    @Override
    String getMileage() {
        return this.carMileage;

    }


}
public class CarInheritance {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int carType = Integer.parseInt(bufferedReader.readLine().trim());
        int carMileage = Integer.parseInt(bufferedReader.readLine().trim());

        if(carType==0){
            Car wagonR = new WagonR(carMileage);
            wagonR.printCar("wagonR");
        }else if(carType==1){
            Car hondaCity = new HondaCity(carMileage);
            hondaCity.printCar("HondaCity");
        }else{
            Car innovaCrysta = new InnovaCrysta(carMileage);
            innovaCrysta.printCar("InnovaCrysta");
        }

    }
}

abstract class Car {
    abstract String getMileage();

    private Boolean isSedan;
    private String seats;

    public Car(Boolean isSedan, String seats) {
        this.isSedan = isSedan;
        this.seats = seats;
    }

    public Boolean getSedan() {
        return isSedan;
    }

    public String getSeats() {
        return seats;
    }


    public void printCar(String wagonR) {
        String sedanis = "";
        if(this.isSedan == true){
            sedanis = " is Sedan, is ";

        }else
            sedanis = " is not Sedan, is ";
        System.out.println("A "+ wagonR+ sedanis + this.seats +"-seater, and mileage is "+ getMileage());
    }
}

