package lab7.AnimalRescue;

public abstract class WorkingDog extends Dog{
    private boolean isHardWorking;
    public abstract boolean isFriendly();
    public abstract void eat();
    public abstract void sleep();

    public boolean isHardWorking() {
        return isHardWorking;
    }

    public void setHardWorking(boolean hardWorking) {
        isHardWorking = hardWorking;
    }
}
