import java.util.ArrayList;

public class BearShop {
    private String shopName;
    private ArrayList<Object> bears;

    public BearShop(String shopName) {
        this.shopName = shopName;
        bears = new ArrayList<>();
    }

    public void createBear() {
        if (bears.size() % 2 == 0) {
            bears.add(new SimpleBear());
        } else if (bears.size() % 5 == 0) {
            bears.add(new CrankyBear());
        } else {
            bears.add(new DrunkBear());
        }
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public ArrayList<Object> getBears() {
        return bears;
    }

    public void setBears(ArrayList<Object> bears) {
        this.bears = bears;
    }

    public void compareShopTo(BearShop shop1){
        int bearShop1Size = this.getBears().size();
        int bearShop2Size = shop1.getBears().size();
        if (bearShop1Size == bearShop2Size) {
            System.out.println("Both Bear Shop's have the same number of bears");
        } else if (bearShop1Size > bearShop2Size) {
            System.out.println("Bear Shop " + this.getShopName() + " has more bears");
        } else {
            System.out.println("Bear Shop " + shop1.getShopName() + " has more bears");
        }
    }
}
