package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Where(clause = "is_deleted=false")
public class Invoice extends BaseEntity{

    @Column(columnDefinition = "DATE")
    LocalDate invoiceDate;
    Integer invoiceNumber;
    String invoiceType;

    //    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "client_id")
//    private Client client;

}
