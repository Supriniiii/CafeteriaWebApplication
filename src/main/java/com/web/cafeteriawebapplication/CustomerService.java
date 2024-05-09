package com.web.cafeteriawebapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.web.cafeteriawebapplication.customerDao;

@Service
public interface CustomerService  {

    void save(Customer customer);


}