package IvantiTest;

public class Dog extends Animal implements Bark, Jump{
    private String dogFur;

    public String getDogFur() {
        return dogFur;
    }

    public void setDogFur(String dogFur) {
        this.dogFur = dogFur;
    }

    @Override
    public void bark() {
        System.out.println("Dog Barks!!");
    }

    @Override
    public void jump() {
        System.out.println("Dog Jumps!!");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
