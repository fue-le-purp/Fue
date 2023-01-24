public class WoodenDuck extends Duck{
    public WoodenDuck() {
        flyBehavior = new NotFly();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("<<...>>");
    }
}
