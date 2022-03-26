package Order;

import Database.database;
import Menu.MenuItem;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Delivery extends Order{
    private String address;
    private String driveID;
    private boolean driveComplete;



    public Delivery(String customID, ArrayList<MenuItem> items, boolean approval, LocalDateTime time, database a, String address, String driveID) {
        super(customID, items, approval);
        this.address = address;
        this.driveID = driveID;
    }

    public Delivery(String customID, String driveID, ArrayList<MenuItem> items, boolean approval, String address) {
        this.driveID = driveID;
        record(customID, items, approval, address);
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
                "address='" + address + '\'' +
                ", driveID=" + driveID +
                '}';
    }


    public void record(String customID, ArrayList<MenuItem> items, boolean approval, String address) {
        setCustomID(customID);
        setItems(items);
        setTime(LocalDateTime.now());
        setApproval(approval);
        setAddress(address);
    }
}
