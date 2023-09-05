package oop;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractExample abstractExample = new AbstractExample() {
            //exempliar objecta skritovo clasa
            @Override
            public int legsQuantity() {
                return 8;
            }
        };

        DogExtendsAbstracts dogExtendsAbstracts = new DogExtendsAbstracts();
    }
}
