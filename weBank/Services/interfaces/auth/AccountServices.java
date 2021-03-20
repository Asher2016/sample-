package com.weBank.weBank.Services.interfaces.auth;

import com.weBank.weBank.entities.Customer;
import com.weBank.weBank.entities.Account;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/16/21
 */
public interface AccountServices {

        public Customer register(final Account account);
}
