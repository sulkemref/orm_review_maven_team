package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Where(clause = "is_deleted=false")
public class Invoice extends BaseEntity{

    @Column(columnDefinition = "DATE")
    private LocalDate invoiceDate;
    private String invoiceNumber;
    private String invoiceType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

}
