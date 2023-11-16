class SimpleBear {

    private int battery = 5;

    public SimpleBear() {
    }

    public void talk() {
        if (battery > 1) {
            System.out.println("I love you");
        } else {
            System.out.println("Pronto, estragaste o urso mano");
        }
        battery -= 1;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
