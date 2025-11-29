package model;
import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {

    private final String color;


    public Apple(int amount, double price, String color) {
            this.color = color;
            super.setAmount(amount);
            super.setPrice(price);
            super.setVegetarian(true);

    }

    @Override
    public double getDiscount() {
        return Colour.RED.equals(color) ?  (double) Discount.DISCOUNT_RED / 100 :  0;
    }


}
