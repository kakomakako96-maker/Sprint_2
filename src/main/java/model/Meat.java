package model;

public class Meat extends Food {

public Meat(int amount, double price) {
    super.setAmount(amount);
    super.setPrice(price);
    super.setVegetarian(false);

}

    @Override
    public double getDiscount(){
        return 0;
    }

}
