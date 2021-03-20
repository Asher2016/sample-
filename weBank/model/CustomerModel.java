package com.weBank.weBank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class CustomerModel {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

}
