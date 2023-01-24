public class NotFly implements FlyBehavior{
    @Override
    public void fly() {

    }

    @Override
    public void notFly() {
        System.out.println("I'm not flying");
    }
}
