package com.kitchenStory.serviceImplementation;

import com.kitchenStory.dao.FoodJPA;
import com.kitchenStory.model.Food;
import com.kitchenStory.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodImpl implements FoodService {
    @Autowired
    private FoodJPA foodJPA;
    public List<Food> getFoodList(){
        return foodJPA.findAll(Sort.by(Sort.Order.asc("FOOD-PRICE")));
    }
}
