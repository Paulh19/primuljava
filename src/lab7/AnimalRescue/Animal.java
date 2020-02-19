package lab7.AnimalRescue;

public abstract class Animal implements LivingThings{
    private String name;
    private float age;
    private float weight;
    @Override
    public abstract void eat();
    public abstract void sleep();
    public abstract void sound();
    public void run(){
        System.out.println("Run");
    }
    public void setName (String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setAge(float age) {
        this.age = age;
    }
    public float getAge() {
        return age;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

}
