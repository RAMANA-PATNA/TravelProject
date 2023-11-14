import java.util.ArrayList;

public class Travel {
    
    public boolean isCarDriver(Driver driver){
        return driver.getCatagory().equalsIgnoreCase("car");
    }

    public String retrivebyDriverId(final ArrayList<Driver> driverList, final int driverid) {
        for(Driver driver:driverList){
            if(driver.getDriverid() == driverid){
                return "Driver name is "+ driver.getDrivername()+ " Belongs to the catagory "+driver.getCatagory()+" travelled "+driver.getTotaldistance()+" KM so far.";
            }
        }
        return "Oops..! No driverid found in the driver list";

    }
    public int retriveCountofDriver(final ArrayList<Driver> driverlist, final String catagory ){
        int count =0;
        for(Driver driver: driverlist){
            if(driver.getCatagory().equals(catagory)){
                count++;
            }
        }
        return count;
        
    }
    public ArrayList<Driver>  retriveDriver(final ArrayList<Driver> driverlist, final String catagory){
        ArrayList<Driver> driverCatagory = new ArrayList<>();
        for(Driver driver: driverlist){
            if(driver.getCatagory().equals(catagory)){
                driverCatagory.add(driver);
            }
        }
        return driverCatagory;
        
    }
    public ArrayList<Driver> retriveMaximumdistaceTravelledDriver(ArrayList<Driver> driverlist){
        float maxDistance = Integer.MIN_VALUE;
        ArrayList<Driver> driverMaxDistance = new ArrayList<>();

        for(Driver driver:driverlist){
            if(driver.getTotaldistance() > maxDistance){
                maxDistance = (float) driver.getTotaldistance();
                driverMaxDistance.clear();
                driverMaxDistance.add(driver);
            }
            else if(driver.getTotaldistance() == maxDistance){
                driverMaxDistance.add(driver);
            }
        }
        return driverMaxDistance;
                
    }

}
