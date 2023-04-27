package com.cydeo.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class InvoiceProduct extends BaseEntity {

    private Integer profit, quantity;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "invoice_id")
//    private Invoice invoice;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "product_id")
//    private Product;

}
