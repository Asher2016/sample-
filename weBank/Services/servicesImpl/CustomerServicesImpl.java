package com.weBank.weBank.Services.servicesImpl;

import com.weBank.weBank.Services.interfaces.CustomerServices;
import com.weBank.weBank.entities.Customer;
import com.weBank.weBank.exceptions.NotFoundException;
import com.weBank.weBank.model.CustomerModel;
import com.weBank.weBank.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/12/21
 */
@Component
@AllArgsConstructor
public class CustomerServicesImpl implements CustomerServices {

    private static final Logger logger = LoggerFactory.getLogger(CustomerServicesImpl.class);

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void save(final CustomerModel customerModel){
        try {
            logger.info("Start adding new customer...");
            Customer customer = new Customer();
            customer.setFirstName(customerModel.getFirstName());
            customer.setLastName(customerModel.getLastName());
            customerRepository.save(customer);
        }catch (Exception ex){
            throw new NotFoundException(String.format("Failed to add new customer"));
        }
    }

    @Override
    public CustomerModel getOne(final Long id){
        try {
            logger.info("Start geting customer from database...");
            Customer customerEntity =  customerRepository.findById(id).orElseThrow(()-> new IllegalAccessError(String.format("cannont find customer with id [%d] ", id)));
            CustomerModel customerModel = new CustomerModel();
            customerModel.setFirstName(customerEntity.getFirstName());
            customerModel.setLastName(customerEntity.getLastName());
            return customerModel;
        }catch (Exception ex){
            throw new NotFoundException(String.format("sorry we don't have a customer with id [%d] in our database ", id));
        }

    }

    @Override
    public void delete(final Long id){
        try {
            logger.info(String.format("Start deleting customer with id [%d] ", id));
            customerRepository.deleteById(id);
        }catch (Exception ex){
            throw new NotFoundException("");
        }

    }

    @Override
    public void update(CustomerModel customerModel) {
        try {
            logger.info(String.format("Start updating th customer [%s] ", customerModel.toString()));
            Customer customerEntity = customerRepository.findById(customerModel.getId()).orElseThrow(()-> new NotFoundException(String.format("Cannot find customer with id : [%d] ", customerModel.getId())));
            customerEntity.setLastName(customerModel.getLastName().isBlank() || customerModel.getLastName().isEmpty() ? customerEntity.getLastName() : customerModel.getLastName());
            customerEntity.setFirstName(customerModel.getFirstName().isBlank() || customerModel.getFirstName().isEmpty() ? customerEntity.getFirstName() : customerModel.getFirstName());
            customerEntity.setPhone(customerModel.getPhone().isBlank() || customerModel.getPhone().isEmpty() ? customerEntity.getPhone() : customerModel.getPhone());
            customerEntity.setEmail(customerModel.getEmail().isBlank() || customerModel.getEmail().isEmpty() ? customerEntity.getEmail() : customerModel.getEmail());

        }catch (Exception ex){

        }
    }


}
