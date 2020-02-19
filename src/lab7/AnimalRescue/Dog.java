package lab7.AnimalRescue;

public abstract class Dog extends Animal{
    private String breed;
    public abstract boolean isFriendly();
    public abstract void eat();
    public abstract void sleep();
    public void sound(){
        System.out.println("Barks");
    }
    public void run(){
        System.out.println("Alearga");
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
