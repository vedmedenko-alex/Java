package com.solvd.delivery.classes.places;

import com.solvd.delivery.classes.enums.PlaceType;

// public class Address extends Place {
//     private int apartment;
//     public Address(String city, String street, int building, int apartment, double latitude, double longitude) {
//         super(city, street, building, latitude, longitude);
//         this.apartment = apartment;
//         setPlaceType(PlaceType.ADDRESS);
//     }
//     public int getApartment() {
//         return apartment;
//     }
//     public void setApartment(int apartment) {
//         this.apartment = apartment;
//     }
//     @Override
//     public String typeAddress() {
//         return ("City: " + city + ", " + getPlaceType() +": " + street + " " + building + ", " + "ap. " + apartment);
//     }
// }
public record Address(
        String city,
        String street,
        int building,
        int apartment,
        double latitude,
        double longitude
        ) {

    private static final PlaceType DEFAULT_TYPE = PlaceType.ADDRESS;

    public PlaceType placeType() {
        return DEFAULT_TYPE;
    }

    public String typeAddress() {
        return "City: " + city + ", " + placeType() + ": " + street + " " + building + ", ap. " + apartment;
    }
}
