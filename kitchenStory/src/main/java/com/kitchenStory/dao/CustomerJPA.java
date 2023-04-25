package com.kitchenStory.dao;

import com.kitchenStory.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerJPA extends JpaRepository<Customer,Integer> {
    /** This interface holds the sql functions to perform CRUD operations **/
}
