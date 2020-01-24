package lab3.temaClase.animalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setNume("Rex");
        rex.setAge(3);
        rex.setBreed("Caine Lup");
        rex.setColor("brown");
        rex.setSize(35);
        rex.setisFriendly(true);
        System.out.println("Numele este:" +rex.getNume());
        System.out.println("Varsta lui este de:"+rex.getAge());
        System.out.println("Rasa este:"+rex.getBreed());
        System.out.println("Culoarea este:"+rex.getColor());
        System.out.println("Marimea lui este:"+rex.getSize());
        System.out.println("Este prietenos:"+rex.getisFriendly());
        System.out.println();

        Activity act = new Activity();
        act.setName("a alerga");
        System.out.println("Activitatea de recreere preferata este de: " +act.getName());
        System.out.println();

        Adopter ad = new Adopter();
        ad.setName("Ionescu");
        ad.setAvailableMoney(345.6f);
        System.out.println("Numele adoptatorului este: " +ad.getName());
        System.out.println("Care are disponibila suma de: " +ad.getAvailableMoney()+" lei");
        System.out.println();

        Animal pisica = new Animal();
        pisica.setName("Tofi");
        pisica.setAge(7.4f);
        pisica.setHealth(10);
        pisica.setHungry(6);
        pisica.setJoy(4);
        pisica.setFavoriteActivity("a dormi");
        pisica.setFavoriteFoodName("pestele");
        System.out.println("Numele motanului este: " +pisica.getName());
        System.out.println("Varsta lui este de: " +pisica.getAge() +" ani");
        System.out.println("Activitatea lui preferata este de : " +pisica.getFavoriteActivity());
        System.out.println("Mancarea lui favorita este: " +pisica.getFavoriteFoodName());
        System.out.println("Pe o scara de la 1 la 10");
        System.out.println("Nivelul lui de sanatate este de " +pisica.getHealth());
        System.out.println("Senzatia de foame este de " +pisica.getHungry());
        System.out.println("Nivelul starii lui de spirit este de " +pisica.getJoy());
        System.out.println();

        Food conserve = new Food();
        conserve.setName("Felix");
        conserve.setPrice(7.8f);
        conserve.setAvailability(2322);
        conserve.setQuantity(4);
        System.out.println("Marca conservei de mancare de pisici este: " +conserve.getName());
        System.out.println("Pretul unei conserve este de: " +conserve.getPrice() +" lei");
        System.out.println("Conservele sunt disponibile in pachet de cate: " +conserve.getQuantity());
        System.out.println("Pe stoc mai sunt " +conserve.getAvailability() +" de conserve");
        System.out.println();

        Vet aaa = new Vet();
        aaa.setName("Popescu");
        aaa.setSpecialty("chirurgia");
        System.out.println("Numele veterinarului este: " +aaa.getName());
        System.out.println("Specialitatea lui este: "+aaa.getSpecialty());
    }
}
