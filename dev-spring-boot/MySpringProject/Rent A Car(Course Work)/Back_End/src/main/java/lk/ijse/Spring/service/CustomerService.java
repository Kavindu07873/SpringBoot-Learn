package lk.ijse.Spring.service;

import lk.ijse.Spring.dto.CustomerDto;
import lk.ijse.Spring.entity.Customer;
import org.modelmapper.TypeToken;

import java.util.ArrayList;

public interface CustomerService {
    public  void addCustomer(CustomerDto dto);
    public void UpdateCustomer(CustomerDto dto);
    public void deleteCustomer(int id);
    public ArrayList<CustomerDto> getAllCustomers();

//    CustomerDto searchCustomerByName(String Name);
}
