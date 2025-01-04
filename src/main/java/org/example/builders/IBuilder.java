package org.example.builders;

import org.example.components.CarType;
import org.example.components.Engine;
import org.example.components.Transmission;

public interface IBuilder {
    void setCarType(CarType type);
    void setSeats (int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
