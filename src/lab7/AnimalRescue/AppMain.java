package lab7.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Husky aa=new Husky();
        aa.setBreed("Husky");
        System.out.println(aa.getBreed());
        aa.eat();
        aa.run();
        aa.sleep();
        aa.setAge(6.7f);
        System.out.println(aa.getAge());
        aa.setName("Lord");
        System.out.println(aa.getName());
        System.out.println(aa.isFriendly());
        aa.sound();
        aa.setWeight(45.6f);
        System.out.println(aa.getWeight());
    }
}
