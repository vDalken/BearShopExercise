import java.util.Random;

class DrunkBear extends SimpleBear{
    public DrunkBear() {
    }

    @Override
    public void talk(){
        Random random = new Random();
        int randomNumber = random.nextInt(0,5001);
        if(randomNumber>2){
            System.out.println("I love you");
        }else{
            System.out.println("És incrível, ném é bom, estragaste outro urso");
            System.out.println("HHHHHHHHHHHHuhhhhhhhhhh HHHHHHHHuuuuuuhhhhhhhh");
        }
    }
}
