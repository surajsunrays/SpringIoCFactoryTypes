package com.app.bean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryNew implements FactoryBean {
    public String carname;

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public Object getObject() throws Exception {
        Car c = (Car) Class.forName(carname).newInstance();
        return c;
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
