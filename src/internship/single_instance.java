package internship;

public class single_instance {
    public static void main(String[] args) {
        Hungry hungry1 = Hungry.getInstance();
        hungry1.speak();
    }
}
class Hungry{
    public Hungry() {
    }
    private final static Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
    public void speak(){
        System.out.println("我能说话");
    }
}
