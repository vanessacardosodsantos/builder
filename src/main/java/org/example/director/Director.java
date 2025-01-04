package org.example.director;

import org.example.builders.IBuilder;
import org.example.components.CarType;
import org.example.components.Engine;
import org.example.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(new Engine(13000));
    }
}
