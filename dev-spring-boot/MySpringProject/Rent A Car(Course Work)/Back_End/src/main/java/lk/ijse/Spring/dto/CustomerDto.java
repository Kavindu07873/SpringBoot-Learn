package lk.ijse.Spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CustomerDto {
    private int Id;
    private String Name;
    private String Address;
    private String Email;
    private String ConNo;
    private String Password;
    private String Nic;
}
