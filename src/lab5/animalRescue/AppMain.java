package lab5.animalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal aa=new Animal();
        System.out.println("Animal: ");
        aa.run();
        aa.sound();
        aa.sleep();
        aa.eat();
        System.out.println();

        Cat pisi=new Cat();
        System.out.println("Cat: " );
        pisi.run();
        pisi.sound();
        pisi.sleep();
        pisi.eat();
        System.out.println();

        Dog rex=new Dog();
        System.out.println("Cainele: ");
        rex.run();
        rex.sound();
        rex.sleep();
        rex.eat();
        System.out.println();

        Horse horse=new Horse();
        System.out.println("Horse:");
        horse.run();
        horse.sound();
        horse.sleep();
        horse.eat();
        System.out.println();

        Fish fish=new Fish();
        System.out.println("Fish:");
        fish.run();
        fish.sound();
        fish.sleep();
        fish.eat();
    }
}
