public class Solution {

    public static void main(String[] args) {
       Duck mallard = new MallardDuck();
       mallard.performFly();
       mallard.performQuack();
       mallard.display();
        System.out.println();

        Duck toy = new ToyDuck();
        toy.performFly();
        toy.performQuack();
        toy.display();
        System.out.println();

        Duck wood = new WoodenDuck();
        wood.performFly();
        wood.performQuack();
        wood.display();
        System.out.println();

        mallard.swim();
    }
}