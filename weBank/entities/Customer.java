package com.weBank.weBank.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/7/21
 */
@Entity
@Table(name = "customers")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name") @Size(min=1,message="first name required")
    private String firstName;

    @Column(name = "last_name") @Size(min=1,message="last name required")
    private String LastName;

    @Column(name = "phone") @Size(min=1,message="phone required")
    private String phone;

    @Column(name = "phone") @Email(message="phone required")
    private String email;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,  optional = true, orphanRemoval = true)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;


}
