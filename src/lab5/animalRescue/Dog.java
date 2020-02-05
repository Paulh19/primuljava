package lab5.animalRescue;

public class Dog extends Animal {

    private String breed;
    private String color;
    private int size;
    private boolean isFriendly;


    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public boolean getisFriendly() {
        return isFriendly;
    }

    public void setisFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public void run(){
        System.out.println("Run!!");
    }

    public void sound() { System.out.println("Latra"); }
}
