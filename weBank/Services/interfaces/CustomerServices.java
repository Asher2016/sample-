package com.weBank.weBank.Services.interfaces;

import com.weBank.weBank.entities.Customer;
import com.weBank.weBank.model.CustomerModel;
import org.springframework.stereotype.Service;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/12/21
 */
@Service
public interface CustomerServices {

     void save(final CustomerModel customerModel);

     CustomerModel getOne(final Long id);

     void delete(final Long id);

     void update(CustomerModel customer);
}
