package oop.inheritance;

public class StampBook implements ISaleableItem{
    private int quantity;
    private int value;

    @Override
    public float Price() {
        return 0;
    }

    @Override
    public void SellCopy() {

    }

    public String toString(){
        return null;
    }
}
