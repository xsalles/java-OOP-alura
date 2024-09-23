package animals;

public class Dog extends Animals{

    @Override
    public void makeASound() {
        System.out.println("Au au au");
    }

    public void wagTail(){
        System.out.println("fre fre");
    }
}
