package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Client extends BaseEntity{

    private String clientName;
    private String email;
    private String phone;

    @ManyToOne
    private Address address;




}
