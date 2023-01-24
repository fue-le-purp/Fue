public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){
    }
    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
        flyBehavior.notFly();
    }
    public void performQuack(){
        quackBehavior.quack();
        quackBehavior.squeak();
    }
    public void swim() {
        System.out.println("All ducks float");
    }
}
