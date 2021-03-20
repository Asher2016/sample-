package com.weBank.weBank.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/16/21
 */

@Entity
@Table(name = "account")
@Data @NoArgsConstructor @AllArgsConstructor
public class Account implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email(message = "email missing")
    @Column(unique = true)
    private String email;

    @Column(name = "password")@Size(min = 6 , message = "password must have at least 6 chaaracter")
    private String password;

    @OneToOne(mappedBy = "account")
    private Customer customer;
}
