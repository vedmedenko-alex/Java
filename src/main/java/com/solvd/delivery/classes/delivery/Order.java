package com.solvd.delivery.classes.delivery;

import com.solvd.delivery.annotations.MinPriceLimit;
import com.solvd.delivery.classes.abstracts.AbstractItem;
import com.solvd.delivery.classes.abstracts.AbstractOrder;
import com.solvd.delivery.classes.humans.Client;
import com.solvd.delivery.classes.places.Restaurant;

@MinPriceLimit(min = 500.0)
public class Order extends AbstractOrder <AbstractItem> {

    public Order(Client client, Restaurant restaurant) {
        super(client, restaurant);
    }

    @Override
    protected AbstractItem getItemFromMenu(String foodName) {
        return restaurant.getMenu().getDish(foodName);
    }
}
