package com.weBank.weBank.repositories;

import com.weBank.weBank.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/7/21
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByFirstName(final String name);
}
