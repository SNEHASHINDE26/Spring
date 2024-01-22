package org.jspiders.customerapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name="customer_info")
public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name="customer_id")
        private  int customerId;

        @Column(name = "customer_name")
        private String customerName;

        @Column(name = "customer_email")
        private String customerEmail;

        @Column(name="customer_age")
        private int customerAge;

        @Column(name = "customer_total_purchase_amt")
        private  double customerTotalPurchaseAmt;
}
