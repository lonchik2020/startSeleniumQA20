package oop;

public class CatParent implements Animals{
    @Override
    public int legsQuantity() {
        return 6;
    }

    @Override
    public String voice() {
        return "myaumayu";
    }

    public int jumpHigh(){
        return 3;
    }
}
