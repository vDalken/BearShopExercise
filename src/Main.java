public class Main {
    public static void main(String[] args) {
        CrankyBear crankyBear = new CrankyBear();
        DrunkBear drunkBear = new DrunkBear();
        SimpleBear simpleBear = new SimpleBear();
        crankyBear.talk();
        crankyBear.talk();
        crankyBear.talk();
        drunkBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        simpleBear.talk();
        BearShop bearShop1 = new BearShop("roto");
        BearShop bearShop2 = new BearShop("MIRAAA");
        bearShop1.createBear();
        bearShop2.createBear();
        bearShop2.createBear();

        bearShop1.compareShopTo(bearShop2);
    }
}