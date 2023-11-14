import java.util.ArrayList;

public class App {
    public static void main(String[] args)  {
       
        Driver driver = new Driver();
        driver.setCatagory("Car");
        driver.getCatagory();

        ArrayList<Driver> driverList = new ArrayList<>();
        driverList.add(new Driver("Car", 123, "Jack", 789.09f));
        driverList.add(new Driver("Car", 124, "Sparrow", 889.09f));
        driverList.add(new Driver("Car", 125, "Ram", 930.09f));
        driverList.add(new Driver("lorry", 126, "Jai", 980.09f));


        Travel travelerList = new Travel();

        //System.out.println("Given car driver details : "+travelerList.isCarDriver(driverList.get(1)));
        System.out.println("Given car driver details : "+ travelerList.isCarDriver(driverList.get(0)));
        System.out.println("Driver Details : "+ travelerList.retrivebyDriverId(driverList, 126));
        System.out.println("Count the car drivers : "+ travelerList.retriveCountofDriver(driverList, "Car"));
        System.out.println("Who travel Max distance :"+ travelerList.retriveMaximumdistaceTravelledDriver(driverList));

    }
}
