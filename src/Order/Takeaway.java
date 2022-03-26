package Order;

import Database.database;
import Menu.MenuItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Takeaway extends Order{
    private LocalDateTime arriveTime;

    public Takeaway() {
    }

    public Takeaway(String customID, ArrayList<MenuItem> items, boolean approval, LocalDateTime time) {
        super(customID, items, approval);
    }

    public Takeaway(String customerID, LocalDateTime arriveTime, ArrayList<MenuItem> items, boolean approval) {
        this.arriveTime = arriveTime;
        record(customerID, items, approval);
    }

    public LocalDateTime getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(LocalDateTime arriveTime) {
        this.arriveTime = arriveTime;
    }

    @Override
    public String toString() {
        return "Takeaway{" +
                "arriveTime=" + arriveTime +
                '}';
    }


    public void record(String customerID, ArrayList<MenuItem> items, boolean approval) {
        Scanner sc = new Scanner(System.in);
        setCustomID(customerID);
        setItems(items);
        setTime(LocalDateTime.now());
        setApproval(approval);
    }
}
