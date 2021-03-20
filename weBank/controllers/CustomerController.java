package com.weBank.weBank.controllers;

import com.weBank.weBank.Services.interfaces.CustomerServices;
import com.weBank.weBank.entities.Customer;
import com.weBank.weBank.exceptions.NotFoundException;
import com.weBank.weBank.model.CustomerModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


/**
 * Created by
 * User: Aloui Achref
 * Date: 3/19/21
 */
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private static final Logger logger  = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    private CustomerServices customerServices;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public CustomerModel get(@PathVariable Long id){
        try {
            logger.info("Finding Customer process ...");
            return customerServices.getOne(id) ;
        }catch (Exception ex){
            throw new NotFoundException(String.format("sorry we don't have a customer with id [%d] in our database ", id));
        }
    }

    @PostMapping(value = "/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@Valid @RequestBody CustomerModel customerModel){
        try {
            logger.info("Adding Customer process ...");
            customerServices.save(customerModel);
        }catch (Exception ex){
            throw new NotFoundException(String.format("sorry we don't have a customer with id [%d] in our database "));
        }
    }
    @PostMapping(value = "/update")
    @ResponseStatus(HttpStatus.OK)
    public void update(@Valid @RequestBody CustomerModel customer){
        try {
            logger.info("Updating Customer process ...");
             customerServices.update(customer) ;
        }catch (Exception ex){
            throw new NotFoundException(String.format("sorry we don't have a customer with id [%d] in our database "));
        }
    }

    @PostMapping(value = "/delete")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@RequestParam Long id){
        try {
            logger.info("Updating Customer process ...");
             customerServices.delete(id) ;
        }catch (Exception ex){
            throw new NotFoundException(String.format("sorry we don't have a customer with id [%d] in our database "));
        }
    }

}
