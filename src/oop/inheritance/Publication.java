package oop.inheritance;

public class Publication implements ISaleableItem{
    private String title;
    private float price;
    private int copies;


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
