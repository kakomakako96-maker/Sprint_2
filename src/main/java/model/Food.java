package model;


public abstract class Food implements Discountable {
    private int amount;
    private double price;
    private boolean isVegetarian;


    public int getAmount() {
        return amount;
    }

    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }

    public void setVegetarian(boolean newVegetarian) {
        isVegetarian = newVegetarian;
    }



}
