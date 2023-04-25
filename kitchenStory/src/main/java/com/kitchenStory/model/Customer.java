package com.kitchenStory.model;

import com.sun.jdi.PrimitiveValue;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="CUSTOMER")
@ToString
public class Customer {
    /** Holds the info about the customers */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="CUSTOMER_ID",unique=true,nullable=false,length=255)
    @Getter
    @Setter
    private int customerID;
    @Column(name="FIRST_NAME",nullable=false,length=10)
    @Getter @Setter
    private String firstName;
    @Column(name="LAST_NAME",nullable=false,length=10)
    @Getter @Setter
    private String lastName;
    @Column(name="EMAIL",nullable=false,length=20)
    @Getter @Setter
    private String email;

    /** Constructor to initialise the object **/
      public Customer(){
          super();
      }
    public Customer(String firstName,String lastName){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
    }
      public Customer(String firstName,String lastName,String email){
          super();
          this.firstName=firstName;
          this.lastName=lastName;
          this.email=email;
      }
    public Customer(int customerID,String firstName,String lastName,String email){
        super();
        this.customerID=customerID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }
}
