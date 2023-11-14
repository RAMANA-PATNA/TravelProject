public class Driver {


    private  String catagory;
    private int driverid;
    private  String drivername;
    private float totaldistance;

    public Driver() {

    }
    public Driver(String catagory, int driverid, String drivername, float totaldistance){
        this.catagory = catagory;
        this.driverid = driverid;
        this.drivername = drivername;
        this.totaldistance = totaldistance;
    }
    public  String getCatagory() {
        return catagory;
    }
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }
    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }
    public void setTotaldistance(float totaldistance) {
        this.totaldistance = totaldistance;
    }
    public int getDriverid() {
        return driverid;
    }
    public  String getDrivername() {
        return drivername;
    }
    public double getTotaldistance() {
        return totaldistance;
    }
    @Override
    public String toString() {
        return "Driver details  [catagory=" + catagory + ", driverid=" + driverid + ", drivername=" + drivername
                + ", totaldistance=" + totaldistance + "]";
    }
    
}
