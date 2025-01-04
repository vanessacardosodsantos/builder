package org.example;

import org.example.builders.CarBuilder;
import org.example.builders.TruckerBuilder;
import org.example.cars.Car;
import org.example.cars.Truck;
import org.example.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso");

        TruckerBuilder truckBuilder = new TruckerBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println(truck.getCarType() + " criado com sucesso");

    }
}