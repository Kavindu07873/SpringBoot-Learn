package lk.ijse.Spring.service.impl;

import lk.ijse.Spring.dto.CarDto;
import lk.ijse.Spring.entity.Car;
import lk.ijse.Spring.repo.CarRepo;
import lk.ijse.Spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;

@Service

@Transactional
public class CarServiceImpl implements CarService {



    @Autowired
    CarRepo CarRepo;

    @Autowired
     ModelMapper mapper;

    public void UpdateCar(CarDto dto) {
        Car car = mapper.map(dto, Car.class);
        CarRepo.save(car);

    }
    @Override
    public void addCar(CarDto dto) {
//        if (CarRepo.existsById(dto.getCarId())) {
//            throw new RuntimeException("Customer id  " + dto.getCarId() + "  AlReady  exit");
//        }
        Car car = mapper.map(dto, Car.class);
        CarRepo.save(car);
    }
    @Override
    public void deleteCar(int id) {
        CarRepo.deleteById(id);
    }


    public ArrayList<CarDto> getAllCar() {
        return mapper.map(CarRepo.findAll(), new TypeToken<ArrayList<CarDto>>() {
        }.getType());
    }

//    @Override
//    public CarDto SearchCarByType(String type) {
//        return  mapper.map(CarRepo.findCarByType(type),CarDto.class);
//
//    }
//

//    public String findCarNameByType(String type) {
//        return CarRepo.findCarNameByType(type);
//    }
}
