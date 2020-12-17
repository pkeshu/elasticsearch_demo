package com.keshar.basicelasticsearch.loders;

import com.keshar.basicelasticsearch.model.Customer;
import com.keshar.basicelasticsearch.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Loaders {
    @Autowired
    private CustomerRepository repository;

    @PostConstruct
    public void loadAll() {
        System.out.println("Data Loading...");
        repository.saveAll(getData());
        System.out.println("Loading Completed");
    }

    private List<Customer> getData() {
        return Stream.of(
                new Customer("1", "keshar", "paudel", 23),
                new Customer("2", "KESHAR", "paudel", 23),
                new Customer("3", "santosh", "paudel", 23),
                new Customer("4", "laxman", "paudel", 23)
        ).collect(Collectors.toList());
    }
}
