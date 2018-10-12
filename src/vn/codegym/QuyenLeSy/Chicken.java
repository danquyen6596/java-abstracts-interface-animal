package vn.codegym.QuyenLeSy;

public class Chicken extends Animal implements iEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
