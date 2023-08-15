package lk.ijse.Spring.service.impl;

import lk.ijse.Spring.dto.CustomerDto;
import lk.ijse.Spring.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CarServiceImplTest {

    @Autowired
    CustomerService customerService;

    @Test
    public void testMethod() {
        ArrayList<CustomerDto> allCustomers = customerService.getAllCustomers();
        for (CustomerDto allCustomer : allCustomers) {
            System.out.println(allCustomer.toString());
        }
    }
}