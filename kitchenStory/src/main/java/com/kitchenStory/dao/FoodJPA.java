package com.kitchenStory.dao;

import com.kitchenStory.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodJPA extends JpaRepository<Food,Integer>{
    /** This interface holds the sql functions to perform CRUD operations **/
}
