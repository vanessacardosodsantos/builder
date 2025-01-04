package org.example.builders;

import org.example.cars.Truck;
import org.example.components.CarType;
import org.example.components.Engine;
import org.example.components.Transmission;

public class TruckerBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;


    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck getResult() {
        return new Truck(carType, seats, engine, transmission);
    }
}
