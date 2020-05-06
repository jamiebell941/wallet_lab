import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> scanables;

    public Wallet(String name) {
        this.name = name;

        this.scanables = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.scanables.size();
    }

    public void addItem(IScan item) {
        this.scanables.add(item);
    }




}
