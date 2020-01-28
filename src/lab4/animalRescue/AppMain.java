package lab4.animalRescue;

public class AppMain {
    public static void main(String[] args) {
     Cat pisi=new Cat();
        pisi.setName("Tofi");
        pisi.setAge(7.4f);
        pisi.setHealth(10);
        pisi.setHungry(6);
        pisi.setJoy(4);
        pisi.setFavoriteActivity("a dormi");
        pisi.setFavoriteFoodName("pestele");
        System.out.println("Numele motanului este: " +pisi.getName());
        System.out.println("Varsta lui este de: " +pisi.getAge() +" ani");
        System.out.println("Activitatea lui preferata este de : " +pisi.getFavoriteActivity());
        System.out.println("Mancarea lui favorita este: " +pisi.getFavoriteFoodName());
        System.out.println("Pe o scara de la 1 la 10");
        System.out.println("Nivelul lui de sanatate este de " +pisi.getHealth());
        System.out.println("Senzatia de foame este de " +pisi.getHungry());
        System.out.println("Nivelul starii lui de spirit este de " +pisi.getJoy());
        System.out.println();

        Dog rex=new Dog();
        rex.setName("Rex");
        rex.setAge(3.5f);
        rex.setHealth(8);
        rex.setHungry(9);
        rex.setJoy(7);
        rex.setFavoriteActivity("a alerga");
        rex.setFavoriteFoodName("Leonardo");
        System.out.println("Numele cainelui este: " +rex.getName());
        System.out.println("Varsta lui este de: " +rex.getAge() +" ani");
        System.out.println("Activitatea lui preferata este de : " +rex.getFavoriteActivity());
        System.out.println("Mancarea lui favorita este: " +rex.getFavoriteFoodName());
        System.out.println("Pe o scara de la 1 la 10");
        System.out.println("Nivelul lui de sanatate este de " +rex.getHealth());
        System.out.println("Senzatia de foame este de " +rex.getHungry());
        System.out.println("Nivelul starii lui de spirit este de " +rex.getJoy());
        rex.setBreed("Caine Lup");
        System.out.println("Rasa lui este: "+rex.getBreed());
        rex.setColor("Negru");
        System.out.println("Culoarea lui este: "+rex.getColor());
        rex.run();
        rex.setSize(33);
        System.out.println("Marimea lui "+rex.getName()+ " la reaban este: "+rex.getSize());
        rex.setisFriendly(true);
        if (rex.getisFriendly()==true)
        {
            System.out.println(rex.getName()+" este prietenos");
        }else {
            System.out.println(rex.getName() + " este morocanos");
        }
        pisi.meaw();
        System.out.println();

        FoodForFish food =new FoodForFish();
        food.setFel("Flake");
        System.out.println(food.getFel());
        food.setName("Tetra");
        System.out.println(food.getName());
        food.setAvailability(4);
        System.out.println(food.getAvailability());
        food.setPrice(12.56f);
        System.out.println("Mancarea de tip "+food.getFel()+" de la "+food.getName()+" costa: "+food.getPrice()+" lei");
       System.out.println();
        Fish fish=new Fish();
        fish.setName("Sabiutza");
       System.out.println("Numele pestishorului este: "+fish.getName());
       System.out.println();
       Vet doc=new Vet();
       doc.setName("Doctorul Popescu");
       System.out.println(doc.getName());
       doc.setSpecialty("Chirurg Veterinar");
       System.out.println(doc.getSpecialty());
    }
}
