package com.app.bean;

public class CarFactory {
    public String carname;

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }
    public Car getCar() throws Exception{
        Car c =  (Car) Class.forName(carname).newInstance();
        return c;
    }

    @Override
    public String toString() {
        return "CarFactory{" +
                "carname='" + carname + '\'' +
                '}';
    }
}
