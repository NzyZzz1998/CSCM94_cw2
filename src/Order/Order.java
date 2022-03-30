package Order;


import Menu.MenuItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Order {
    private String customID;
    private ArrayList<MenuItem>[] items;
    private boolean orderComplete;
    private LocalDateTime time;
    private boolean chefComplete;
    private boolean approval;



    public Order(String customID, ArrayList<MenuItem>[] items, boolean approval) {
        this.customID = customID;
        this.items = items;
        this.approval = approval;
        this.time = LocalDateTime.now();
        if (approval){
            this.orderComplete = false;
            this.chefComplete = false;
        }
    }

    public String getCustomID() {
        return customID;
    }

    public void setCustomID(String customID) {
        this.customID = customID;
    }

    public ArrayList<MenuItem>[] getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem>[] items) {
        this.items = items;
    }

    public boolean isOrderComplete() {
        return orderComplete;
    }

    public void setOrderComplete(boolean orderComplete) {
        this.orderComplete = orderComplete;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public boolean isChefComplete() {
        return chefComplete;
    }

    public void setChefComplete(boolean chefComplete) {
        this.chefComplete = chefComplete;
    }

    public boolean isApproval() {
        return approval;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customID " + customID +
                " items " + Arrays.toString(items) +
                " orderComplete " + orderComplete +
                " time " + time +
                " }";
    }
}
