package person_age;

public class PersonAge {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    void olderOrYounger(){
        if (age >= 18) {
            System.out.println("\nVocê é maior de idade");
        } else{
            System.out.println("\nVocê é menor de idade");
        }
    }
}
