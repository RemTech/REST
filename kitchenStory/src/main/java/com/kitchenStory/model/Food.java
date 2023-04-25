package com.kitchenStory.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="FOOD-ITEM")
@ToString
public class Food {
    /** holds info about food items for the project*/
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="FOOD-ID",unique=true,nullable=false,length=255)
    @Getter @Setter
    private int foodID;
    @Column(name="FOOD-NAME",nullable=false,length=10)
    @Getter @Setter
    private String foodName;
    @Column(name="FOOD-PRICE",nullable=false,length=20,unique = true)
    @Getter @Setter
    private Double foodPrice;

    /** Constructor to initialise the object **/
    public Food(){
        super();
    }
    public Food(String foodName,Double foodPrice){
        super();
        this.foodName=foodName;
        this.foodPrice=foodPrice;
    }
    public Food(int foodID,String foodName,Double foodPrice){
        super();
        this.foodID=foodID;
        this.foodName=foodName;
        this.foodPrice=foodPrice;
    }
}
