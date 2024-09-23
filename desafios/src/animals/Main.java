package animals;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.makeASound();
        myCat.makeASound();

        myCat.scratchFurniture();
        myDog.wagTail();
    }
}
