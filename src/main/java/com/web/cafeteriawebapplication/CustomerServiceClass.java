package com.web.cafeteriawebapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceClass implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public  void save(Customer customer) {
        customerRepository.save(customer);
    }
//       }
//    @Autowired
//    private customerDao customerDao;
//
//    public List<Customer> getCustomerList() {
//        return this.customerDao.getAllUser();
//    }
//
//
//    public Customer addUser(Customer user) {
//        return this.customerDao.saveUser(user);
//    }
//
//
//    public Customer checkLogin(String username, String password) {
//        return this.customerDao.getUser(username,password);
//    }
//
//
//    public boolean checkUserExists(String username) {
//        return this.customerDao.userExists(username);
//    }

    // Implement business logic methods


}
