package com.driver;

public class Boat implements WaterVehicle{
   private String vehicleName;
   private int vehicleCapacity;

    public Boat(String name, int capacity) {
        this.vehicleName = name;
        this.vehicleCapacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return vehicleName;
    }

    @Override
    public int getVehicleCapacity() {
        return vehicleCapacity;
    }
}
