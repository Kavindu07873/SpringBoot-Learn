package lk.ijse.Spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString

public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;


    private String Vehicle;
    private String user;
    private String carId;
    private String scheduleId;
    private String Type;
    private String Version;
    private int Need;
    private double Total;

    @ManyToOne(cascade = {CascadeType.PERSIST ,CascadeType.MERGE , CascadeType.DETACH ,CascadeType.REFRESH})
    @JoinColumn(name = "order_oid")
    private Orders orders;

//    @ManyToOne
//    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
//    private Orders orders;
//
//    @ManyToOne
//    @JoinColumn(name = "carId",referencedColumnName = "carId",insertable = false,updatable = false)
//    private Car car;
}
