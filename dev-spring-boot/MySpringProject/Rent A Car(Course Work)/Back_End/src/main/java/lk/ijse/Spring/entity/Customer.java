package lk.ijse.Spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_Id")
    private   int Id;
    @Column(name = "Customer_Name")
    private  String Name;
    @Column(name = "Customer_Address")
    private String Address;
    @Column(name = "Customer_Email")
    private String Email;
    @Column(name = "Customer_ConNo")
    private String ConNo;
    @Column(name = "Customer_Password")
    private String Password;
    @Column(name = "Customer_Nic")
    private String Nic;

}
