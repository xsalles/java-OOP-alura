package animals;

public class Cat extends Animals {
    @Override
    public void makeASound() {
        System.out.println("Miau, Miau");
    }

    public void scratchFurniture(){
        System.out.println("tssssss");
    }
}
