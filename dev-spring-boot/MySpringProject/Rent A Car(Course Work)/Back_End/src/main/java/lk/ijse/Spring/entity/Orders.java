package lk.ijse.Spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Orders {

    @Id
    private String oid;
    //Out=verse
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "customerID",referencedColumnName = "Id",nullable = false)
    private Customer cusID;


    private String scheduleId;

    private LocalDate date;

//
//    //Inverse
//    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL)
//    private List<OrderDetails> orderDetails;
}
