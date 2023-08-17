package lk.ijse.Spring.repo;

import lk.ijse.Spring.dto.CustomerDto;
import lk.ijse.Spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
//    Customer findCustomerByName(String Name);
//    Customer findCustomerByName(String name);
    }
