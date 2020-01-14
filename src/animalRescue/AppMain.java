package animalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.nume = "Rex";
        rex.age = 3;
        rex.breed = "Caine Lup";
        rex.color = "brown";
        rex.size = 35;
        rex.isFriendly = true;
        System.out.println(rex.nume);
        System.out.println(rex.age);
        System.out.println(rex.breed);
        System.out.println(rex.color);
        System.out.println(rex.size);
        System.out.println(rex.isFriendly);
        System.out.println();

        Activity act = new Activity();
        act.name = "a alerga";
        System.out.println("Activitatea de recreere preferata este de: " +act.name);
        System.out.println();

        Adopter ad = new Adopter();
        ad.name = "Ionescu";
        ad.availableMoney = 345.6f;
        System.out.println("Numele adoptatorului este: " +ad.name);
        System.out.println("Care are disponibila suma de: " +ad.availableMoney+" lei");
        System.out.println();

        Animal pisica = new Animal();
        pisica.name = "Tofi";
        pisica.age = 7.4f;
        pisica.health = 10;
        pisica.hungry = 6;
        pisica.joy = 4;
        pisica.favoriteActivity = "a dormi";
        pisica.favoriteFoodName = "pestele";
        System.out.println("Numele motanului este: " +pisica.name);
        System.out.println("Varsta lui este de: " +pisica.age +" ani");
        System.out.println("Activitatea lui preferata este de : " +pisica.favoriteActivity);
        System.out.println("Mancarea lui favorita este: " +pisica.favoriteFoodName);
        System.out.println("Pe o scara de la 1 la 10");
        System.out.println("Nivelul lui de sanatate este de " +pisica.health);
        System.out.println("Senzatia de foame este de " +pisica.hungry);
        System.out.println("Nivelul starii lui de spirit este de " +pisica.joy);
        System.out.println();

        Food conserve = new Food();
        conserve.name = "Felix";
        conserve.price = 7.8f;
        conserve.availability = 2322;
        conserve.quantity = 4;
        System.out.println("Marca conservei de mancare de pisici este: " +conserve.name);
        System.out.println("Pretul unei conserve este de: " +conserve.price +" lei");
        System.out.println("Conservele sunt disponibile in pachet de cate: " +conserve.quantity);
        System.out.println("Pe stoc mai sunt " +conserve.availability +" de conserve");
        System.out.println();

        Vet aaa = new Vet();
        aaa.name = "Popescu";
        aaa.specialty= "chirurgia";
        System.out.println("Numele veterinarului este: " +aaa.name);
        System.out.println("Specialitatea lui este: "+aaa.specialty);
    }
}
