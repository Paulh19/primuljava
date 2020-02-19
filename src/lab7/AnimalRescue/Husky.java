package lab7.AnimalRescue;

public class Husky extends Dog{
    @Override
    public void eat() {
        System.out.println("Peste");
    }

    @Override
    public boolean isFriendly() {
        return true;
    }

    @Override
    public void sleep() {
        System.out.println("Not much");
    }
}
