package service;

import model.Food;


public class ShoppingCart {

    private Food[] shoppingCart;


    public ShoppingCart(Food[] shoppingCart) {
        this.shoppingCart = shoppingCart;

    }



    public void sumNoDiscount() {

        double sum = 0;
        //for (int i = 0; i <= shoppingCart.length - 1; i++) {
            for (Food food : shoppingCart){
            sum += food.getAmount() * food.getPrice();}

        System.out.println("Общая сумма товаров без скидки: " + sum);
    }

public void sumDiscount() {
    double sum = 0;
    for (int i = 0; i <= shoppingCart.length - 1; i++) {

        if (shoppingCart[i].getDiscount() == 0) {
            sum += shoppingCart[i].getAmount() * shoppingCart[i].getPrice();

        } else {
            sum += shoppingCart[i].getAmount() * (shoppingCart[i].getPrice() * shoppingCart[i].getDiscount());
        }
    }
    System.out.println("Общая сумма товаров с учетом скидки: " + sum);
}


    public void sumDiscountVegetarian() {
        double sum = 0;
        for (int i = 0; i <= shoppingCart.length - 1; i++) {
            if (shoppingCart[i].isVegetarian()) {
                sum += shoppingCart[i].getAmount() * shoppingCart[i].getPrice();
            }
            }
        System.out.println("Общая всех вегетарианских продуктов без скидки: " + sum);
    }


}

