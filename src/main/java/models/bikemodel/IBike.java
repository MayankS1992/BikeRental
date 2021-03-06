package models.bikemodel;

import entities.bike.Bike;

import java.util.List;

/**
 *
 */
public interface IBike {

    /**
     * this method returns a list of available bikes
     *
     * @param bikeSpot represents the name of bike spot
     * @return a list of available bikes
     */
    List<Bike> checkAvailableBikes(String bikeSpot);
    Boolean addNewServicedBike(Bike ServicedBike);
    Boolean bikeBook(String bikeSpots);
}