package lab5.animalRescue;

public class Animal {
    private String name;
    private float age;
    private int health;
    private int hungry;
    private int joy;
    private String favoriteFoodName;
    private String favoriteActivity;

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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void setHungry(int hungry){
        this.hungry=hungry;
    }
    public int getHungry(){
        return hungry;
    }

    public int getJoy() {
        return joy;
    }

    public void setJoy(int joy) {
        this.joy = joy;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public String getFavoriteFoodName() {
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(String favoriteFoodName) {
        this.favoriteFoodName = favoriteFoodName;
    }
    public void run(){
        System.out.println("Alearga!!");
    }
    public void sound() { System.out.println("Sound"); }
    public void sleep(){
        System.out.println("ZZZZ...");
    }
    public void eat(){
        System.out.println("Eating now!!");
    }
}
