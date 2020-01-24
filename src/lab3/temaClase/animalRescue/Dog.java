package lab3.temaClase.animalRescue;

public class Dog {
    private String nume;
    private String breed;
    private float age;
    private String color;
    private int size;
    private boolean isFriendly;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
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
    public void sleep(){
        System.out.println("ZZZZ...");
    }
    public void eat(){
        System.out.println("Eating now!!");
    }
}
