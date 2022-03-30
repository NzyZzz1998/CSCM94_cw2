package Order;


import Menu.MenuItem;


import java.util.ArrayList;


public class Delivery extends Order{
    private String address;
    private String driveID;
    private boolean driveComplete;



    public Delivery(String customID, ArrayList<MenuItem>[] items, boolean approval, String address, String driveID) {
        super(customID, items, approval);
        this.address = address;
        this.driveID = driveID;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDriveID() {
        return driveID;
    }

    public void setDriveID(String driveID) {
        this.driveID = driveID;
    }

    public boolean isDriveComplete() {
        return driveComplete;
    }

    public void setDriveComplete(boolean driveComplete) {
        this.driveComplete = driveComplete;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "address '" + address +
                " driveID " + driveID +
                " }";
    }

}
