public class ToyDuck extends Duck{
    public ToyDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new NotFly();

    }
    @Override
    public void display() {
        System.out.println("I'm Toy Duck");
    }
}
