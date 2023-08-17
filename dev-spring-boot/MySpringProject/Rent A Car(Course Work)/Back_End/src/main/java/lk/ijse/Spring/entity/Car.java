package lk.ijse.Spring.entity;

import lk.ijse.Spring.entity.VehicleType.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Car_Id")
    private   int carId;

    private   String Version;

    @Enumerated(EnumType.STRING)
    private Type type;

    private String Fuel;
    private String Passengers;
    private String Transmission;
    private String Colour;
    private String Rent_duration;
    private int Amount;
    private String Price;
    private String Price_ExtraKm;



}