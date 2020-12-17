package com.keshar.basicelasticsearch.repository;

import com.keshar.basicelasticsearch.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {
    List<Customer> findCustomerByFirstname(String firstName);
}
