package chapter1;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavoir;
    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavoir.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}