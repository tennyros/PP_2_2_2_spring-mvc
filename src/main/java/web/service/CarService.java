package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void addCar(Car car);
    List<Car> getAllCars();
    List<Car> getCars(int count);
}
