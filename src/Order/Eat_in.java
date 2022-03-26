package Order;


import Menu.MenuItem;


import java.util.ArrayList;


public class Eat_in extends Order{
    private int tableID;
    private String waiterID;


    public Eat_in(String customID, ArrayList<MenuItem> items, boolean approval, int tableID, String waiterID) {
        super(customID, items, approval);
        this.tableID = tableID;
        this.waiterID = waiterID;
    }



    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public String getWaiterID() {
        return waiterID;
    }

    public void setWaiterID(String waiterID) {
        this.waiterID = waiterID;
    }

    @Override
    public String toString() {
        return "Eat_in{" +
                "tableID=" + tableID +
                ", waiterID=" + waiterID +
                '}';
    }

}
