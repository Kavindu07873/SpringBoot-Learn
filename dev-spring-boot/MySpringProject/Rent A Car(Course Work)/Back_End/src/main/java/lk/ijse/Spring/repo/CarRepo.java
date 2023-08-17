package lk.ijse.Spring.repo;

import lk.ijse.Spring.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepo extends JpaRepository<Car,Integer> {
//
//    @Query("SELECT c.Version FROM Car c  WHERE Car.type= :type")
//    Car findCarByType(String type);
//
//    @Query("SELECT c.Version FROM Car c WHERE c.type = :type")
//    String findCarNameByType(String type);
}
