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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oid;

    private String cusID;

    private LocalDate date;

    @OneToMany(mappedBy = "orders", cascade = {CascadeType.PERSIST ,CascadeType.MERGE , CascadeType.DETACH ,CascadeType.REFRESH})
    private List<OrderDetails> orderDetails;
//
//    //Inverse
//    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL)
//    private List<OrderDetails> orderDetails;
}
