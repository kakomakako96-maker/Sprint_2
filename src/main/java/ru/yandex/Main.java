package ru.yandex;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        Food meet = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, Colour.RED);
        Food appleGreen = new Apple(8, 60, Colour.GREEN);


        Food[] basket = new Food[]{meet, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(basket);
        shoppingCart.sumNoDiscount();
        shoppingCart.sumDiscount();
        shoppingCart.sumDiscountVegetarian();
    }
}