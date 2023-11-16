class CrankyBear extends SimpleBear {
    public CrankyBear() {
    }

    @Override
    public void talk() {
        if (getBattery() == 3) {
            System.out.println("Estragador de ursos");
            System.out.println("""
                    Urso: Acho que vou desistir antes mesmo de começar
                    Não vale a pena chorar por um dono assim
                    A minha vontade é de te pôr no hospital mas só posso lamentar""");
        } else {
            System.out.println("I love you");
        }
        setBattery(getBattery()-1);
    }
}