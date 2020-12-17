package com.keshar.basicelasticsearch;

import com.keshar.basicelasticsearch.model.Customer;
import com.keshar.basicelasticsearch.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class BasicElasticSearchApplication {
    @Autowired
    private CustomerRepository repository;

    @PostMapping("/saveCustomers")
    public int saveCustomers(@RequestBody List<Customer> customers) {
        repository.saveAll(customers);
        return customers.size();
    }

    @GetMapping("/findAll")
    public Iterable<Customer> findAllCustomers() {
        return repository.findAll();
    }

    @GetMapping("/findByFName/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName) {
        return repository.findCustomerByFirstname(firstName);
    }

    public static void main(String[] args) {
        SpringApplication.run(BasicElasticSearchApplication.class, args);
    }

}
