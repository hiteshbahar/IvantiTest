package IvantiTest;

public class Frog extends Animal implements Croak, Jump{
    private String frogPoisonLevel;

    public String getFrogPoisonLevel() {
        return frogPoisonLevel;
    }

    public void setFrogPoisonLevel(String frogPoisonLevel) {
        this.frogPoisonLevel = frogPoisonLevel;
    }

    @Override
    public void croak() {
        System.out.println("Frog Croaks!!!");
    }

    @Override
    public void jump() {
        System.out.println("Frog Jumps!!!");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
